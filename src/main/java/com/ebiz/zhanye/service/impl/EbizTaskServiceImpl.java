package com.ebiz.zhanye.service.impl;


import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.dao.EbizTaskDAO;
import com.ebiz.zhanye.db.dao.EbizTaskSpecDAO;
import com.ebiz.zhanye.db.generated.model.EbizTask;
import com.ebiz.zhanye.db.generated.model.EbizTaskExample;
import com.ebiz.zhanye.dto.TaskCustomerDTO;
import com.ebiz.zhanye.dto.TaskDTO;
import com.ebiz.zhanye.service.EbizTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EbizTaskServiceImpl implements EbizTaskService {

    @Autowired
    EbizTaskDAO ebizTaskDAO;

    @Autowired
    EbizTaskSpecDAO taskSpecDAO;


    /**
     * 更新展业任务
     * @param ebizTask
     * @return
     */
    @Override
    public ResultModel updateTask(EbizTask ebizTask) {
        EbizTaskExample example = new EbizTaskExample();
        EbizTaskExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeleteEqualTo(0).andIdEqualTo(ebizTask.getId());
        ebizTask.setModifiedDate(new Date());
        ebizTask.setIsDelete(0);
        ebizTaskDAO.updateByExampleSelective(ebizTask,example);
        return null;
    }

    @Override
    public List<TaskCustomerDTO> selectLikeTask(TaskDTO taskDTO) {
        return taskSpecDAO.selectLikeTask(taskDTO);
    }
}
