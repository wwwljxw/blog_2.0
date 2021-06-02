package com.forever.blogserver.utils;

import com.forever.blog.pojo.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @ClassName UserUtil
 * @Description 用户工具类
 * @author Lin
 * @Date 2021/5/31 9:29
 **/
public class UserUtil {


    /**
     * @description 获取当前登录用户
     * @author Lin
     * @date 2021/5/31 9:38
     * @return UserInfoDTO用户登录信息
    */
    public static User getLoginUser(){
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
