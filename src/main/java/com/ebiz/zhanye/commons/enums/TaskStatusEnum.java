package com.ebiz.zhanye.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum TaskStatusEnum {
    NASSIGNED(0,"展业中止"),
    ASSIGNED(1,"展业中");

    private int code;
    private String status;

    public static int getCodeByStatus(String status){
        return Arrays.stream(values()).filter(n->n.status.equals(status)).findAny().get().code;  }

    public static String getStatusByCode(int code){
        return Arrays.stream(values()).filter(n->n.code == code).findAny().get().status;
    }
}
