package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.About;
import com.forever.blogserver.dao.AboutDao;
import com.forever.blogserver.service.AboutService;
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
public class AboutServiceImpl extends ServiceImpl<AboutDao, About> implements AboutService {

}
