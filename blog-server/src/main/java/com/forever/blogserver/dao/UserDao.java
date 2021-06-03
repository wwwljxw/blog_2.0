package com.forever.blogserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forever.blog.pojo.User;
import com.forever.blogserver.dto.UserDTO;
import com.forever.blogserver.vo.UserQueryVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface UserDao extends BaseMapper<User> {
    /**
     * 根据用户名查询角色名
     * @author Lin
     * @date: 2021/6/2 23:20
     * @param username 用户名
     * @return java.util.List<java.lang.String>
    */
    List<String> listUserRolesByUsername(@Param("username") String username);

    /**
     * 条件查询用户
     * @author Lin
     * @date: 2021/6/2 23:43
     * @param userQueryVO 前端传过来的参数
     * @return java.util.List<com.forever.blogserver.dto.UserDTO>
    */
    List<UserDTO> getUserByCondition(@Param("userQueryVO") UserQueryVO userQueryVO);




}
