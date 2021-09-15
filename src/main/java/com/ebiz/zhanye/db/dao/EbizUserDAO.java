package com.ebiz.zhanye.db.dao;


import com.ebiz.zhanye.config.BaseMybatisDAO;
import com.ebiz.zhanye.db.generated.model.EbizUser;
import com.ebiz.zhanye.db.generated.model.EbizUserExample;
import org.springframework.stereotype.Repository;

@Repository
public interface EbizUserDAO extends BaseMybatisDAO<EbizUser, String, EbizUserExample> {
}