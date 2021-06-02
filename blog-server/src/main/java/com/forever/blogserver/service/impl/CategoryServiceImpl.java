package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Category;
import com.forever.blogserver.dao.CategoryDao;
import com.forever.blogserver.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {

}
