package com.forever.blogserver.controller;


import com.forever.blog.entity.Result;
import com.forever.blog.entity.ResultInfo;
import com.forever.blog.pojo.Menu;
import com.forever.blogserver.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/getMenuList")
    public Result getMenuListByUserRole(@RequestParam("roleName") String roleName) {
        System.out.println(roleName);
        List<Menu> menuList = menuService.getMenuListByUserRole(roleName);
        if (menuList.size() > 0) {
            return Result.ok()
                    .code(ResultInfo.SUCCESS.getCode())
                    .message(ResultInfo.SUCCESS.getMessage())
                    .data("menuList", menuList);
        } else {
            return Result.error().message("你没有权限可以访问列表");
        }
    }

}

