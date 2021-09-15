package com.ebiz.zhanye.controller;

import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.generated.model.EbizTask;
import com.ebiz.zhanye.dto.TaskCustomerDTO;
import com.ebiz.zhanye.dto.TaskDTO;
import com.ebiz.zhanye.service.EbizTaskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/task")
public class EbizTaskController {

    @Autowired
    EbizTaskService ebizTaskService;

    @ApiOperation(value="更新展业任务")
    @PostMapping("/update")
    public ResultModel updateTask(@RequestBody EbizTask ebizTask){
        if(StringUtils.isEmpty(ebizTask.getId())){
            return ResultModel.error("您输入的任务号为空");
        }
        if(ebizTask.getTaskStatus()==null){
            return ResultModel.error("您输入的展业状态为空");
        }
        ebizTaskService.updateTask(ebizTask);
        return ResultModel.success("更新成功");
    }

    @ApiOperation("模糊查询业务")
    @PostMapping("/selectLikeTask")
    public ResultModel selectLikeTask(@Validated @RequestBody(required = false) TaskDTO taskDTO) {
        PageHelper.startPage(taskDTO.getPageNum(), taskDTO.getPageSize());
        List<TaskCustomerDTO> taskCustomerDTOS = ebizTaskService.selectLikeTask(taskDTO);
        if (taskCustomerDTOS == null) {
            log.error("数据错误：{}", taskCustomerDTOS.toString());
            return ResultModel.error("数据错误：" + taskCustomerDTOS.toString());
        }
        if (taskCustomerDTOS.size() == 0) {
            return ResultModel.error("数据库没有此数据，请插入后再次查询");
        }
        PageInfo<TaskCustomerDTO> pageInfo = new PageInfo<>(taskCustomerDTOS);
        Map resultMap = new HashMap();
        resultMap.put("total", pageInfo.getTotal());
        resultMap.put("taskInfo", pageInfo.getList());
        return ResultModel.success(resultMap);
    }

}
