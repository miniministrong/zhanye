package com.ebiz.zhanye.service.impl;

import com.ebiz.zhanye.commons.enums.IsDeleteEnum;
import com.ebiz.zhanye.db.dao.EbizUserDAO;
import com.ebiz.zhanye.db.generated.model.EbizUser;
import com.ebiz.zhanye.db.generated.model.EbizUserExample;
import com.ebiz.zhanye.service.EbizUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EbizUserServiceImpl implements EbizUserService {

    @Autowired
    EbizUserDAO userDAO;

    EbizUserExample userExample = new EbizUserExample();

    @Override
    public String insert(EbizUser user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        user.setCreatedDate(new Date());
        if(userDAO.insertSelective(user) == 1){
            return id;
        }else {
            return "";
        }
    }

    @Override
    public int deleteById(String id) {
        userDAO.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public EbizUser selectById(String id) {
        return userDAO.selectByPrimaryKey(id);
    }

    @Override
    public int update(EbizUser user) {
        return userDAO.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<EbizUser> selectByName(String name) {
        userExample.createCriteria().andUsernameEqualTo(name);
        return userDAO.selectByExample(userExample);
    }

    @Override
    public List<EbizUser> selectByCnoAndCname(String id, String name) {
        userExample.createCriteria().andIdEqualTo(id).andUsernameEqualTo(name);
        return userDAO.selectByExample(userExample);
    }

    @Override
    public EbizUser login(EbizUser user) {
        EbizUserExample userExample = new EbizUserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(user.getPassword());
        List<EbizUser> users = userDAO.selectByExample(userExample);
        return !CollectionUtils.isEmpty(users) ? users.get(0) : null;
    }

    @Override
    public List<EbizUser> selectByNo(Integer workNo) {
        EbizUserExample userExample = new EbizUserExample();
        userExample.createCriteria().andWorkNoEqualTo(workNo);
        return userDAO.selectByExample(userExample);
    }

    @Override
    public List<EbizUser> listUsersByNoAndName() {
        EbizUserExample userExample = new EbizUserExample();
        userExample.createCriteria().andIdIsNotNull().andIsDeleteEqualTo(IsDeleteEnum.IS_NOT_DELETE.getCode());
        return userDAO.selectByExample(userExample);
    }
}
