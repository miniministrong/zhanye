package com.ebiz.zhanye.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author dhl
 * @datetime 2021/8/17  14:07
 */
@AllArgsConstructor
@Getter
public enum IsDeleteEnum {
    IS_NOT_DELETE(0, "未删除"),
    IS_DELETE(1, "已删除");

    private int code;
    private String message;

    public static String getMessageByCode(int code) {
        return Arrays.stream(values())
                .filter(n -> n.code == code)
                .findAny()
                .get()
                .message;
    }

    public static int getCodeByMessage(String message) {
        return Arrays.stream(values()).
                filter(n -> n.message.equals(message))
                .findAny()
                .get()
                .code;
    }
}