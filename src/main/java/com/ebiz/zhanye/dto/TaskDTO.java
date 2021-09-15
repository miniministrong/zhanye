package com.ebiz.zhanye.dto;

import com.ebiz.zhanye.db.generated.model.Page;
import lombok.Data;
import lombok.ToString;

/**
 * @author dhl
 * @datetime 2021/8/17  15:08
 */
@Data
@ToString
public class TaskDTO extends Page {
    private String customerId;
    private String customerName;
    private Integer taskStatus;
    private String taskNo;
}