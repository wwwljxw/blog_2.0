package com.forever.blogserver;

import com.alibaba.fastjson.JSON;
import com.forever.blog.pojo.Menu;
import com.forever.blogserver.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogServerApplicationTests {

    @Autowired
    private MenuService menuService;

    @Test
    void contextLoads() {
        List<Menu> admin = menuService.getMenuListByUserRole("admin");
        System.out.println(JSON.toJSONString(admin));
    }

}
