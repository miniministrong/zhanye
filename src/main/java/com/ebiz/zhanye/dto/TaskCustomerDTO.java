package com.ebiz.zhanye.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/8/17  15:49
 */
@Data
@ToString
public class TaskCustomerDTO {
    //展业主键id
    private String id;
    private String taskNo;
    private Integer taskStatus;
    private String customerId;
    private String deptName;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskCreatedDate;
}