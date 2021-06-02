package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Article;
import com.forever.blogserver.dao.ArticleDao;
import com.forever.blogserver.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}
