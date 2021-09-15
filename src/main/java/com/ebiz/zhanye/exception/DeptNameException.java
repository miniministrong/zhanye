package com.ebiz.zhanye.exception;


public class DeptNameException extends Exception {
    private String message;
    public DeptNameException() {
        super();
    }

    public DeptNameException(String message) {
        super(message);
    }
}
