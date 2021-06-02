package com.forever.blogserver.service;

import com.forever.blog.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface UserService extends IService<User> {
    User getUserByUsername(String username);

    List<String> listUserRolesByUsername(String username);

    boolean checkLogin(String username,String password);
}
