package com.ebiz.zhanye.db.dao;


import com.ebiz.zhanye.config.BaseMybatisDAO;
import com.ebiz.zhanye.db.generated.model.EbizTask;
import com.ebiz.zhanye.db.generated.model.EbizTaskExample;
import org.springframework.stereotype.Repository;

@Repository
public interface EbizTaskDAO extends BaseMybatisDAO<EbizTask, String, EbizTaskExample> {
}