package com.forever.blogserver.controller;


import com.forever.blog.entity.Result;
import com.forever.blogserver.dto.UserDTO;
import com.forever.blogserver.service.UserService;
import com.forever.blogserver.vo.UserQueryVO;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public Result getUserList(UserQueryVO userQueryVO){
        List<UserDTO> userByCondition = userService.getUserByCondition(userQueryVO);
        int count = userService.count();
        if (userByCondition != null){
            return Result.ok()
                    .data("userList",userByCondition)
                    .data("total",count);
        }
        return Result.error();
    }
}

