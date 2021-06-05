package com.forever.blogserver.service;

import com.forever.blog.pojo.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.forever.blogserver.dto.RoleDTO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface RoleService extends IService<Role> {
    /**
     * 查询角色名合各角色的个数
     * @author: Lin
     * @date: 2021/6/3 11:44
     * @return java.util.List<com.forever.blogserver.dto.RoleDTO>
    */
    List<RoleDTO> getRoleList();
}
