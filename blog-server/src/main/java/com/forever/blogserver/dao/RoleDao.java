package com.forever.blogserver.dao;

import com.forever.blog.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forever.blogserver.dto.RoleDTO;
import com.forever.blogserver.dto.UrlRoleDTO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface RoleDao extends BaseMapper<Role> {
    List<RoleDTO> getRoleList();

    List<UrlRoleDTO> urlRoleList();
}
