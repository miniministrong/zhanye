package com.ebiz.zhanye.config;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseMybatisDAO <T, PK extends Serializable, E>{
    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(PK id);

    int deleteByPrimaryKeys(@Param("ids") List<PK> ids);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(PK id);

    List<T> selectByPrimaryKeys(@Param("ids") List<PK> ids);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
