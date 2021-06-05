package com.forever.blogserver;

import com.forever.blogserver.dto.RoleDTO;
import com.forever.blogserver.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    private RoleService roleService;

    @Test
    void contextLoads() {
        List<RoleDTO> roleList = roleService.getRoleList();
        roleList.forEach(System.out::println);
    }

}
