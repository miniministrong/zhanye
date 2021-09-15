package com.ebiz.zhanye.service;

import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.generated.model.EbizTask;
import com.ebiz.zhanye.dto.TaskCustomerDTO;
import com.ebiz.zhanye.dto.TaskDTO;

import java.util.List;

public interface EbizTaskService{



    /**
     * 更新展业任务
     * @param ebizTask
     * @return
     */
    ResultModel updateTask(EbizTask ebizTask);

    /**
     * 根据传入相对应的参数模糊查询数据
     * @param taskDTO
     * @return
     */
    List<TaskCustomerDTO> selectLikeTask(TaskDTO taskDTO);
}
