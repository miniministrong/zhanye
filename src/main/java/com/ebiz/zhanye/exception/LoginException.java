package com.ebiz.zhanye.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dhl
 * @datetime 2021/8/17  13:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginException extends RuntimeException{
    private int code;
    private String message;

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}