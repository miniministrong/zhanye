package com.ebiz.zhanye.dto;

import lombok.Data;

import java.util.List;

/**
 * 批量指派DTO
 */
@Data
public class CustomerListDTO {
    /**
     * 客户id
     */
    private List<String> idList;
    /**
     * 用户工号
     */
    Integer workNo;
    /**
     * 备注
     */
    private String taskRemarks;
}
