package com.forever.blogserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forever.blog.pojo.User;
import com.forever.blogserver.dao.UserDao;
import com.forever.blogserver.dto.UserDTO;
import com.forever.blogserver.service.UserService;
import com.forever.blogserver.vo.UserQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUserByUsername(String username) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        return this.baseMapper.selectOne(wrapper);
    }

    @Override
    public List<String> listUserRolesByUsername(String username) {
        return this.baseMapper.listUserRolesByUsername(username);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        //重用户里面查出用户 然得到加密的密码
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("password").eq("username", username);
        User user = this.baseMapper.selectOne(wrapper);
        if(user==null){
            return  false;
        }
        //这个是加密后的密码 在数据库里面
        String userPassword = user.getPassword();
        //用加密匹配这个 能匹配返回true 不能返回false
        return   bCryptPasswordEncoder.matches(password, userPassword);
    }

    @Override
    public List<UserDTO> getUserByCondition(UserQueryVO userQueryVO) {
        return this.baseMapper.getUserByCondition(userQueryVO);
    }
}
