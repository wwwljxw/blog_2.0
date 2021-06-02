package com.forever.blogserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forever.blog.pojo.User;
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
    List<String> listUserRolesByUsername(@Param("username") String username);

}
