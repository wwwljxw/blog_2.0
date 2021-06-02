package com.forever.blogserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forever.blog.pojo.Menu;
import com.forever.blogserver.dao.MenuDao;
import com.forever.blogserver.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

    /**
     * @param roleName
     * @return List<Menu>
     * @description: 通过角色名 查找对应的菜单
     * @author: Lin
     * @date: 2021/6/1 16:13
     */
    @Override
    public List<Menu> getMenuListByUserRole(String roleName) {
        //        查出该角色所对应的菜单
        List<Menu> menuList = this.baseMapper.getMenuListByUserRole(roleName);
//        对查询到的菜单进行处理，返回前端需要的格式
        List<Menu> menuListDTO = new ArrayList<>();
        int len = menuList.size();
        int[] used = new int[menuList.size()];
//        填充为0，0表示没用过，1表示用过了
        Arrays.fill(used, 0);
        for (int i = 0; i < len; i++) {
            if (menuList.get(i).getParentId() == 0 || menuList.get(i).getParentId() == null) {
                //            找到父级菜单，并根据父级菜单去查找子级菜单
                used[i] = 1;
                findChildren(menuList.get(i), menuList, used);
                menuListDTO.add(menuList.get(i));
            }
        }
        return menuListDTO;
    }


    /**
     * @param menu
     * @param menuList
     * @description: 递归遍历子级菜单
     * @author: Lin
     * @date: 2021/6/2 0:18
     */
    private void findChildren(Menu menu, List<Menu> menuList, int[] used) {
        for (int i = 0; i < menuList.size(); i++) {
            if (used[i] == 1) {
                continue;
            }
            if (menuList.get(i).getParentId().equals(menu.getMenuId())) {
                used[i] = 1;
                menu.getChildren().add(menuList.get(i));
            }
//            如果遍历完后，没有子菜单了说明找完了
            if (menu.getChildren().size() == 0) {
                return;
            }
//            如果没有找完，则继续递归遍历查找
            menu.getChildren().forEach(menu1 -> findChildren(menu1, menuList, used));
        }
    }
}
