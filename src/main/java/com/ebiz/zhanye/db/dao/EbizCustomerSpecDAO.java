package com.ebiz.zhanye.db.dao;

import com.ebiz.zhanye.db.generated.model.EbizCustomer;
import com.ebiz.zhanye.dto.CustomerResultDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EbizCustomerSpecDAO {
    /**
     * 根据idList查询客户
     * @param idList
     * @return
     */
    List<EbizCustomer> getCustomerByIdSet(List<String> idList);

    /**
     * 通过用户id和用户名模糊查询
     * @param id
     * @param name
     * @return: List<EbizCustomer>
     */
    List<EbizCustomer> selectByCnoAndCname(@Param("id") String id, @Param("name") String name);

    /**
     * 通过id查询用户状态
     * @param id
     * @return: int
     */
    int selectStatusById(String id);

    /**
     * 修改用户状态
     * @param id
     * @param newStatus
     * @return: int
     */
    int changeStatus(@Param("id") String id, @Param("status") int newStatus);

    /**
     * 通过id删除用户
     * @param id
     * @return: int
     */
    int deleteById(String id);
    /**
     * 两表查询（customer,user）
     * 条件（customer id 和 name）模糊查询
     * @param id
     * @param name
     * @return: List<CustomerDTO>
     */
    List<CustomerResultDTO> getTwoTableInfo(@Param("id") String id, @Param("name") String name);
    /**
     * 三表查询（customer,user,task）
     * 条件（customer id 和 name）模糊查询
     * @param id
     * @param name
     * @return: List<CustomerDTO>
     */
    List<CustomerResultDTO> getThreeTableInfo(@Param("id") String id, @Param("name") String name);

    /**
     * 通过id查询客户信息
     * @param id
     * @return: EbizCustomer
     */
    EbizCustomer selectById(String id);

    /**
     * 查询公司姓名的数量
     * @param customerName
     * @return: int
     */
    List<String> selectNumByCname(@Param("name")String customerName);
}
