package com.forever.blogserver.service.impl;

import com.forever.blog.pojo.Message;
import com.forever.blogserver.dao.MessageDao;
import com.forever.blogserver.service.MessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements MessageService {

}
