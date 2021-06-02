package com.forever.blogserver.service.auth;

import com.forever.blog.pojo.User;
import com.forever.blogserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MyDetailsService
 * @Description:
 * @Author: Lin
 * @Date: 2021/5/30 15:31
 **/
@Service("userDetailsService")
public class MyDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.isEmpty()) {
            throw new UsernameNotFoundException("用户名为空");
        }
        User user = userService.getUserByUsername(username);
        System.out.println(user);
        if (user != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
//            根据用户名查询角色列表
            List<String> roles = userService.listUserRolesByUsername(username);

            SimpleGrantedAuthority simpleGrantedAuthority=null;
            for (String role : roles) {
                simpleGrantedAuthority = new SimpleGrantedAuthority(role);
                authorities.add(simpleGrantedAuthority);
            }
//            返回用户与角色列表
            return new UserAuth(user,authorities);
        } else {
            throw new UsernameNotFoundException("该用户不存在");
        }
    }
}
