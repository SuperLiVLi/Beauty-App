package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Comment)表服务接口
 *
 * @author makejava
 * @since 2022-07-09 22:01:04
 */
public interface CommentService {

    /**
     * 通过技师ID查询对应的评论
     * @param id
     * @return
     */
    List<Comment> queryCommentById(Integer id);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    Boolean insert(Comment comment);
}
