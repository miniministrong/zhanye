package com.ebiz.zhanye.db.dao;

import com.ebiz.zhanye.dto.TaskCustomerDTO;
import com.ebiz.zhanye.dto.TaskDTO;

import java.util.List;

/**
 * @author dhl
 * @datetime 2021/8/17  15:27
 */
public interface EbizTaskSpecDAO {

    /**
     * 根据用户传入的数据模糊查询
     * @param taskDTO
     * @return
     */
    List<TaskCustomerDTO> selectLikeTask(TaskDTO taskDTO);

    /**
     * 查询全部数据
     * @return
     */
    List<TaskCustomerDTO> listTasks();
}
