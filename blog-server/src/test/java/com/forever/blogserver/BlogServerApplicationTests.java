package com.forever.blogserver;

import com.forever.blogserver.dao.RoleDao;
import com.forever.blogserver.dto.RoleDTO;
import com.forever.blogserver.dto.UrlRoleDTO;
import com.forever.blogserver.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    private RoleDao roleDao;

    @Test
    void contextLoads() {

    }

}
