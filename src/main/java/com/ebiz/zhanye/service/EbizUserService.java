package com.ebiz.zhanye.service;

import com.ebiz.zhanye.db.generated.model.EbizUser;

import java.util.List;

public interface EbizUserService {
    String insert(EbizUser user);

    int deleteById(String id);

    EbizUser selectById(String id);

    int update(EbizUser user);

    List<EbizUser> selectByName(String name);

    List<EbizUser> selectByCnoAndCname(String id, String name);

    EbizUser login(EbizUser user);

    List<EbizUser> selectByNo(Integer workNo);

    List<EbizUser> listUsersByNoAndName();
}
