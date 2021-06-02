package com.forever.blogserver.handler;

import com.alibaba.fastjson.JSON;
import com.forever.blog.entity.Result;
import com.forever.blog.entity.ResultInfo;
import com.forever.blogserver.service.auth.UserAuth;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName MyAuthenticationSuccessHandler
 * @Description
 * @Author Lin
 * @Date 2021/5/31 17:34
 **/
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDetails){
            UserAuth userAuth = (UserAuth) principal;
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(Result.ok()
                    .code(ResultInfo.VERIFY_SUCCESS.getCode())
                    .message(ResultInfo.VERIFY_SUCCESS.getMessage())
                    .data("user",userAuth)));
        }
    }
}
