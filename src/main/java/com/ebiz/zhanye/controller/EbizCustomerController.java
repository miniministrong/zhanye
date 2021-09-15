package com.ebiz.zhanye.controller;

import com.ebiz.zhanye.commons.validation.customer.Update;
import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.generated.model.EbizCustomer;
import com.ebiz.zhanye.dto.CustomerResultDTO;
import com.ebiz.zhanye.dto.CustomerListDTO;
import com.ebiz.zhanye.dto.CustomerParmDTO;
import com.ebiz.zhanye.service.EbizCustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@CrossOrigin("*")
@Slf4j
@RequestMapping("/customer")
public class EbizCustomerController {

    @Autowired
    EbizCustomerService customerService;

    @ApiOperation(value="批量指派")
    @PostMapping("/updateList")
    public ResultModel updateList(@RequestBody CustomerListDTO customerListDTO){
        if(customerListDTO.getWorkNo()==null){
            return ResultModel.error("请选择销售人员");
        }
        if(customerListDTO.getIdList().size()==0){
            return ResultModel.error("请选择指派人");
        }
        return customerService.updateList(customerListDTO);
    }

    @ApiOperation(value="批量回收")
    @PostMapping("/recovery")
    public ResultModel recoveryList(@RequestBody CustomerListDTO customerListDTO){
        if(customerListDTO.getIdList().size()==0){
            return ResultModel.error("请选择客户回收");
        }
        return customerService.recoveryList(customerListDTO);
    }
    /**
     * 增加客户
     * @param customer
     * @return: ResultModel
     */
    @ApiOperation(value="添加客户")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResultModel insert(@RequestBody EbizCustomer customer){
        String id = customerService.insert(customer);
        if(StringUtils.isBlank(id)){
            return ResultModel.error(500,"插入失败!");
        }else {
            if (StringUtils.isBlank(id)){
                return ResultModel.error(500,"插入失败!");
            }
            else {
                return ResultModel.success("插入客户数据成功！",id);
            }
        }
    }

    /**
     * 删除用户(假删)
     * @param id
     * @return: ResultModel
     */
    @ApiOperation(value="删除客户（id）")
    @RequestMapping(value="/deleteById",method = RequestMethod.GET)
    public ResultModel deleteById(@RequestParam(value = "id") String id ){
        if(StringUtils.isEmpty(id)){
            return ResultModel.error("根据id删除失败！");
        }else {
            int row = customerService.deleteById(id);
            if(row > 0){
                return ResultModel.success("根据id删除成功！");
            }else {
                return ResultModel.error("根据删除失败！");
            }
        }
    }

    /**
     * 更新用户
     * @param customer
     * @return: ResultModel
     */
    @ApiOperation(value="修改客户")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResultModel update(@Validated(Update.class) @RequestBody EbizCustomer customer){
        int row = customerService.update(customer);
        if(row == 0){
            return ResultModel.error(500,"更新失败：注意公司名称是否重复或其他导致失败情况！");
        }
        return ResultModel.success("成功修改"+row+"数据！");
    }

    /**
     * 通过id查询用户
     * @param id
     * @return: ResultModel
     */
    @ApiOperation(value="查询用户（id）")
    @RequestMapping(value="/selectById",method = RequestMethod.GET)
    public ResultModel selectById(@RequestParam(value = "id") String id ){
        if(StringUtils.isEmpty(id)){
            return ResultModel.error();
        }else {
            EbizCustomer customer = customerService.selectById(id);
            if (customer == null) {
                return ResultModel.error("查询失败！");
            }else {
                return ResultModel.success("查询成功！"+customer);
            }
        }
    }

    /**
     * 获取全部的id
     * @param
     * @return: ResultModel
     */
    @ApiOperation(value="模糊查询获取的信息")
    @RequestMapping(value = "/getAllInfo",method = RequestMethod.POST)
    public ResultModel getInfo(@RequestBody CustomerParmDTO parm){
        Integer size = parm.getPageSize();
        Integer num = parm.getPageNum();
        if(num >= 1 && size >= 1){
            String cid = parm.getId();
            String cname = parm.getDept_name();
            PageHelper.startPage(num,size);
            PageInfo<CustomerResultDTO> pageInfo = new PageInfo<>(customerService.getAllInfo(cid,cname));
            Map map = new HashMap();
            map.put("total",pageInfo.getTotal());
            map.put("info",pageInfo.getList());
            return ResultModel.success(map);
        }
        else {
            return ResultModel.error("分页信息不正确！");
        }
    }


}
