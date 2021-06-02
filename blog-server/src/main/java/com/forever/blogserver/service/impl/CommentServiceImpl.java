package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Comment;
import com.forever.blogserver.dao.CommentDao;
import com.forever.blogserver.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

}
