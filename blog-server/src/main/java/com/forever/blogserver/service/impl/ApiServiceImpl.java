package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Api;
import com.forever.blogserver.dao.ApiDao;
import com.forever.blogserver.service.ApiService;
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
public class ApiServiceImpl extends ServiceImpl<ApiDao, Api> implements ApiService {

}
