package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.entity.Comment;
import com.cqut.beautifulapp.dao.CommentDao;
import com.cqut.beautifulapp.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2022-07-09 22:01:04
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;


    /**
     * 通过技师ID查询对应评价
     * @param id
     * @return
     */
    @Override
    public List<Comment> queryCommentById(Integer id) {
        List<Comment> lists = commentDao.queryCommentById(id);
        return lists;
    }

    /**
     * 插入评论
     * @param comment
     * @return
     */
    @Override
    public Boolean insert(Comment comment) {
         int result = commentDao.insert(comment);
         if(result == 1){
             return true;
         }else{
             return false;
         }
    }


}
