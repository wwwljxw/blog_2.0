package com.forever.blogserver.exception;

import com.forever.blog.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName GlobalException
 * @Description
 * @Author Lin
 * @Date 2021/5/22 23:10
 **/
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(MyRunTimeException.class)
    @ResponseBody
    public Result exception(MyRunTimeException e) {
        e.printStackTrace();
        return new Result(false,e.getCode(),e.getMessage());
    }
}
