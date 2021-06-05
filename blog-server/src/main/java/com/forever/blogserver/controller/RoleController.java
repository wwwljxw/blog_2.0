package com.forever.blogserver.controller;


import com.forever.blog.entity.Result;
import com.forever.blogserver.dto.RoleDTO;
import com.forever.blogserver.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getRoleList")
    public Result getRoleList(){
        List<RoleDTO> roleList = roleService.getRoleList();

        if (roleList.size()>0){
            return Result.ok().data("roleList",roleList);
        }
        return Result.error();
    }
}

