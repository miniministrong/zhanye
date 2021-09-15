package com.ebiz.zhanye.db.dao;


import com.ebiz.zhanye.config.BaseMybatisDAO;
import com.ebiz.zhanye.db.generated.model.EbizCustomer;
import com.ebiz.zhanye.db.generated.model.EbizCustomerExample;
import org.springframework.stereotype.Repository;

@Repository
public interface EbizCustomerDAO extends BaseMybatisDAO<EbizCustomer, String, EbizCustomerExample> {
}