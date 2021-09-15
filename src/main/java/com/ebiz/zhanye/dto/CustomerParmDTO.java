package com.ebiz.zhanye.dto;

import com.ebiz.zhanye.db.generated.model.Page;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 接收前端的分页数据
 * @param null
 * @return: null
 */
@Data
public class CustomerParmDTO extends Page implements Serializable {
    String id;
    String dept_name;
}
