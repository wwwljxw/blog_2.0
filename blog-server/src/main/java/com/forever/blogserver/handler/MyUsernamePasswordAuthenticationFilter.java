package com.forever.blogserver.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyUsernamePasswordAuthenticationFilter
 * @Description 用户名密码认证过滤器
 * @Author Lin
 * @Date 2021/5/31 14:39
 **/
public class MyUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        判断是否以json传输数据
        if (request.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE) || request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {
//            判断是否以POST传输数据
            if (!request.getMethod().equals("POST")) {
//                如果不是POST则抛出异常
                throw new AuthenticationServiceException("authentication method not supported" + request.getMethod());
            }
//            获取用户名和密码
            Map<String, String> map = new HashMap<>();
            ObjectMapper objectMapper = new ObjectMapper();
            try (InputStream in = request.getInputStream()) {
                map = objectMapper.readValue(in, Map.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (map != null) {
                String username = map.get("username");
                String password = map.get("password");
                if (username == null) {
                    username = "";
                }
                if (password == null) {
                    password = "";
                }
                username = username.trim();
                password = password.trim();
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
                return this.getAuthenticationManager().authenticate(authenticationToken);
            }
        }
        return null;
    }
}
