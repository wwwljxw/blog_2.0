package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Role;
import com.forever.blogserver.dao.RoleDao;
import com.forever.blogserver.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}
