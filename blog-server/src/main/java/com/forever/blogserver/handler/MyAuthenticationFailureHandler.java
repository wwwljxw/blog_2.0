package com.forever.blogserver.handler;

import com.alibaba.fastjson.JSON;
import com.forever.blog.entity.Result;
import com.forever.blog.entity.ResultInfo;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录失败
 * @ClassName AuthenticationFailureHandler
 * @Author Lin
 * @Date 2021/5/31 22:31
 **/
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(Result.error()
                .code(ResultInfo.LOGIN_FAILED.getCode())
                .message(ResultInfo.LOGIN_FAILED.getMessage())));
    }
}
