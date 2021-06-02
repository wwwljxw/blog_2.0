package com.forever.blogserver.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName MyRunTimeException
 * @Description
 * @Author Lin
 * @Date 2021/5/22 23:29
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class MyRunTimeException extends RuntimeException{
    private String message;
    private int code;

    public MyRunTimeException(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
