package com.ebiz.zhanye.service.impl;

import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.dao.EbizCustomerDAO;
import com.ebiz.zhanye.db.dao.EbizCustomerSpecDAO;
import com.ebiz.zhanye.db.dao.EbizTaskDAO;
import com.ebiz.zhanye.db.dao.EbizUserDAO;
import com.ebiz.zhanye.db.generated.model.*;
import com.ebiz.zhanye.dto.CustomerResultDTO;
import com.ebiz.zhanye.dto.CustomerListDTO;
import com.ebiz.zhanye.exception.DeptNameException;
import com.ebiz.zhanye.service.EbizCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class EbizCustomerServiceImpl implements EbizCustomerService {

    @Autowired
    EbizCustomerDAO customerDAO;
    @Autowired
    EbizCustomerSpecDAO customerSpecDAO;
    @Autowired
    EbizUserDAO ebizUserDAO;
    @Autowired
    EbizTaskDAO ebizTaskDAO;



    /**
     * 批量指派
     * @param customerListDTO
     * @return
     */
    @Override
    @Transactional
    public ResultModel updateList(CustomerListDTO customerListDTO) {
        //跟据idlist查询出客户
        List<EbizCustomer> customerByIdSet = customerSpecDAO.getCustomerByIdSet(customerListDTO.getIdList());
        //根据员工号查询用户id
        EbizUserExample example = new EbizUserExample();
        EbizUserExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeleteEqualTo(0).andWorkNoEqualTo(customerListDTO.getWorkNo());
        //查询对应业务员
        List<EbizUser> ebizUsers = ebizUserDAO.selectByExample(example);
        //将id赋给客户表的userId
        for (EbizCustomer ebizCustomer : customerByIdSet) {
            if(ebizCustomer.getUserId()!=null&&ebizCustomer.getUserId().equals(ebizUsers.get(0).getId())){
                String deptName = ebizCustomer.getDeptName();
                return ResultModel.error(deptName+"已经被"+customerListDTO.getWorkNo()+"指派");
            }else {
                //删除之前的任务
                //查询之前的任务
                EbizTaskExample example1 = new EbizTaskExample();
                EbizTaskExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andIsDeleteEqualTo(0).andCustomerIdEqualTo(ebizCustomer.getId());
                List<EbizTask> ebizTasks = ebizTaskDAO.selectByExample(example1);
                if (ebizTasks.size()>0){
                    for (EbizTask ebizTask : ebizTasks) {
                        //判断是否存在任务号
                        if (ebizTask!=null&&ebizTask.getTaskStatus().equals(1)){
                            ebizTask.setIsDelete(1);
                            ebizTask.setModifiedDate(new Date());
                            ebizTaskDAO.updateByPrimaryKey(ebizTask);
                        }
                    }
                }
                //设置客户状态
                ebizCustomer.setCustomerStatus(1);
                //设置客户指派人
                ebizCustomer.setUserId(ebizUsers.get(0).getId());
                //设置修改时间
                ebizCustomer.setModifiedDate(new Date());
                //新增展业任务
                EbizTask ebizTask = new EbizTask();
                //设置备注
                ebizTask.setTaskRemarks(customerListDTO.getTaskRemarks());
                //设置展业状态
                ebizTask.setTaskStatus(1);
                //设置客户id
                ebizTask.setCustomerId(ebizCustomer.getId());
                //自动生成相关字段
                ebizTask.setIsDelete(0);
                ebizTask.setCreatedDate(new Date());
                String id = UUID.randomUUID().toString().split("-")[0];
                String id2 = UUID.randomUUID().toString().split("-")[0];
                ebizTask.setId(id);
                ebizTask.setTaskNo(id2);
                //保存客户状态并记录状态
                customerDAO.updateByPrimaryKey(ebizCustomer);
                //记录展业任务插入结果
                ebizTaskDAO.insert(ebizTask);
            }
        }
        return null;
    }

    /**
     * 批量回收
     * @param customerListDTO
     * @return
     */
    @Override
    @Transactional
    public ResultModel recoveryList(CustomerListDTO customerListDTO) {
        //跟据idlist查询出客户
        List<EbizCustomer> customerByIdSet = customerSpecDAO.getCustomerByIdSet(customerListDTO.getIdList());
        for (EbizCustomer ebizCustomer : customerByIdSet) {
            //判断是否被回收
            if(ebizCustomer.getCustomerStatus().equals(0)){
                //查询出被回收的客户
                EbizCustomer ebizCustomer1 = customerDAO.selectByPrimaryKey(ebizCustomer.getId());
                return ResultModel.error(ebizCustomer1.getDeptName()+"已经被回收");
            }else {
                //将客户表的客户状态置为未指派
                ebizCustomer.setCustomerStatus(0);
                //将客户表的userId置为0
                ebizCustomer.setUserId(null);
                customerDAO.updateByPrimaryKey(ebizCustomer);
                //更改展业任务信息
                EbizTaskExample example = new EbizTaskExample();
                EbizTaskExample.Criteria criteria = example.createCriteria();
                criteria.andIsDeleteEqualTo(0).andCustomerIdEqualTo(ebizCustomer.getId());
                //通过客户id查询相关展业任务
                List<EbizTask> ebizTasks = ebizTaskDAO.selectByExample(example);
                for (EbizTask ebizTask : ebizTasks) {
                    ebizTask.setTaskNo("");
                    //设置修改日期
                    ebizTask.setModifiedDate(new Date());
                    //回收则删除此条记录
                    ebizTask.setIsDelete(1);
                    ebizTaskDAO.updateByPrimaryKey(ebizTask);
                }
            }
        }
        return null;
    }

    /**
     * 插入用户状态
     * @param customer
     * @return: String
     */
    @Override
    public String insert(EbizCustomer customer) {
        String id = UUID.randomUUID().toString().split("-")[0];
        customer.setId(id);
        customer.setCustomerStatus(0);
        customer.setCreatedDate(new Date());
        customer.setModifiedUser(id);
        customer.setIsDelete(0);
        customer.setUserId(null);
        EbizCustomerExample customerExample = new EbizCustomerExample();
        customerExample.createCriteria().andDeptNameEqualTo(customer.getDeptName());
        List<EbizCustomer> customerList = customerDAO.selectByExample(customerExample);
        int size = customerList.size();
        if(size == 0){
            if(customerDAO.insertSelective(customer)== 1){
                return id;
            }else {
                return "";
            }
        }else{
            return "";
        }
    }

    /**
     * 删除客户（假删）
     * @param id
     * @return: int
     */
    @Override
    public int deleteById(String id) {
        return customerSpecDAO.deleteById(id);
    }
    /**
     * 通过id查询用户状态
     * @param id
     * @return: EbizCustomer
     */
    @Override
    public EbizCustomer selectById(String id) {
//        customerExample.createCriteria().andIdEqualTo(id).andIsDeleteEqualTo(0);
        EbizCustomer customer = customerSpecDAO.selectById(id);
        return customer;
    }

    /**
     * 通过用户名查询
     * is_delete字段为0
     * @param name
     * @return: List<EbizCustomer>
     */
    @Override
    public List<EbizCustomer> selectByName(String name) {
        EbizCustomerExample customerExample = new EbizCustomerExample();
        customerExample.createCriteria().andCustomerNameEqualTo(name).andIsDeleteEqualTo(0);
        return customerDAO.selectByExample(customerExample);
    }

    /**
     * 根据用户id查询用户状态
     * @param id
     * @return: int
     */
    @Override
    public int selectStatusById(String id) {
        return customerSpecDAO.selectStatusById(id);
    }

    /**
     * 更新客户信息
     * is_delete为0未删除
     * id为主键
     * 更新修改时间
     * @param customer
     * @return: int
     */
    @Override
    @Transactional
    public int update(EbizCustomer customer) {
        customer.setModifiedDate(new Date());
        EbizCustomerExample customerExample = new EbizCustomerExample();
        if(StringUtils.isBlank(customer.getDeptName())){
            return 0;
        }else {
            customerExample.createCriteria().andDeptNameEqualTo(customer.getDeptName()).andIsDeleteEqualTo(0);
            // 获取待修改名称在数据库中的id，注意此处get(0)是因为数据库给dept_name添加了约束，使其唯一；否则应该接收List再判断
            List<EbizCustomer> customers = customerDAO.selectByExample(customerExample);
            int size = customers.size();
            customerExample = new EbizCustomerExample();
            customerExample.createCriteria().andIsDeleteEqualTo(0).andIdEqualTo(customer.getId());
            if (size == 0) {
                return customerDAO.updateByExampleSelective(customer, customerExample);
            } else {
                customerExample = new EbizCustomerExample();
                customerExample.createCriteria().andIsDeleteEqualTo(0).andIdEqualTo(customer.getId());
                if (customers.get(0).getId().equals(customer.getId())) {
                    try {
                        int i = customerDAO.updateByExampleSelective(customer, customerExample);
                        if (i == 0) {
                            throw new DeptNameException("更新失败，请重新修改");
                        }
                        return i;
                    } catch (DeptNameException e) {
                        log.error("更新失败，请重新修改");
                        return 0;
                    }
                }else {
                    return 0;
                }
            }

    }
}

    /**
     * id和name模糊查
     * @param id
     * @param name
     * @return: List<EbizCustomer>
     */
    @Override
    public List<EbizCustomer> selectByCnoAndCname(String id, String name) {
        EbizCustomerExample customerExample = new EbizCustomerExample();
        customerExample.createCriteria().andIdEqualTo(id).andCustomerNameEqualTo(name);
        return customerSpecDAO.selectByCnoAndCname(id,name);
    }

    /**
     * 修改客户状态
     * @param id
     * @return: int
     */
    @Transactional
    @Override
    public int changeStatus(String id) {
        int preStatus = this.selectStatusById(id);
        if(preStatus == 0){
            int newStatus = 1;
            return customerSpecDAO.changeStatus(id,newStatus);
        }else{
            int newStatus = 0;
            return customerSpecDAO.changeStatus(id,newStatus);
        }
    }

    /**
     * 获取所有客户信息
     * @param cid
     * @param cname
     * @return: List<CustomerDTO>
     */
    @Override
    @Transactional
    public List<CustomerResultDTO> getAllInfo(String cid, String cname) {
        return customerSpecDAO.getThreeTableInfo(cid,cname);
    }
}
