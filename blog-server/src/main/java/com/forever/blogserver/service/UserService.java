package com.forever.blogserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forever.blog.pojo.User;
import com.forever.blogserver.dto.UserDTO;
import com.forever.blogserver.vo.UserQueryVO;

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

    /**
     * 条件查询用户
     * @author Lin
     * @date: 2021/6/2 23:43
     * @param userQueryVO 前端传过来的参数
     * @return java.util.List<com.forever.blogserver.dto.UserDTO>
     */
    List<UserDTO> getUserByCondition(UserQueryVO userQueryVO);
}
