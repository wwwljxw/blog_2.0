package com.forever.blogserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forever.blog.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface MenuDao extends BaseMapper<Menu> {

    List<Menu> getMenuListByUserRole(String roleName);
}
