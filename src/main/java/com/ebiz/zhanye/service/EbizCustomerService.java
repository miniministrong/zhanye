package com.ebiz.zhanye.service;

import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.generated.model.EbizCustomer;
import com.ebiz.zhanye.dto.CustomerListDTO;
import com.ebiz.zhanye.exception.DeptNameException;

import java.util.List;

public interface EbizCustomerService {
    /**
     * 批量指派
     * @param customerListDTO
     * @return
     */
    ResultModel updateList(CustomerListDTO customerListDTO);

    /**
     * 批量回收
     * @param customerListDTO
     * @return
     */
    ResultModel recoveryList(CustomerListDTO customerListDTO);

    String insert(EbizCustomer customer);

    int deleteById(String id);

    int update(EbizCustomer customer);

    EbizCustomer selectById(String id);

    List<EbizCustomer> selectByName(String name);

    List<EbizCustomer> selectByCnoAndCname(String id, String name);

    int selectStatusById(String id);

    int changeStatus(String id);

    List getAllInfo(String cid, String cname);
}
