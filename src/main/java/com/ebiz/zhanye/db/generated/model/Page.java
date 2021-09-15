package com.ebiz.zhanye.db.generated.model;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author dhl
 * @datetime 2021/8/17  17:56
 */
@Data
@ToString
public class Page {
    @NotNull(message = "页码不能为空")
    private Integer pageNum;
    @NotNull(message = "每页的数量不能为空")
    private Integer pageSize;
}