package com.forever.blogserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forever.blog.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
public interface MenuService extends IService<Menu> {

    /**
     * 通过角色名 查找对应的菜单
     * @author: Lin
     * @date: 2021/6/1 16:13
     * @param roleName 角色名
     * @return List<MenuDTO>
    */
    List<Menu> getMenuListByUserRole(String roleName);
}
