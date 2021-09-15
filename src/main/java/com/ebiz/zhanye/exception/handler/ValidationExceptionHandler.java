package com.ebiz.zhanye.exception.handler;

import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.exception.DeptNameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dhl
 * @datetime 2021/8/17  14:27
 */
@Slf4j
@RestControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResultModel<?> validationErrorHandler(MethodArgumentNotValidException e) {
        List<String> errorInfo = e
                .getBindingResult()
                .getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        log.error(errorInfo.toString());
        return new ResultModel(400, errorInfo.toString());
    }

    @ExceptionHandler({ConstraintViolationException.class})
    public ResultModel validationParamErrorHandler(ConstraintViolationException e) {
        List<String> errorInfo = e
                .getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList());
        log.error(errorInfo.toString());
        return new ResultModel(400, errorInfo.toString());
    }

    @ExceptionHandler(DeptNameException.class)
    public ResultModel deptNameExceptionHandler(DeptNameException e){
        String message = e.getMessage();
        log.error(message);
        return ResultModel.error(400, message);
    }

    /*@ExceptionHandler(Exception.class)
    public ResultModel exceptionHandler(Exception e){
        String message = e.getMessage();
        return new ResultModel(500, "系统错误：" + message);
    }*/
}