package com.ebiz.zhanye.dto;

import lombok.Data;

@Data
public class CustomerResultDTO {
    String id; //客户号
    String name; //客户名称
    Integer status;//客户状态
    String taskId;//展业任务号
    String workerNum;//销售员工号
    String workerName;//销售名称
}
