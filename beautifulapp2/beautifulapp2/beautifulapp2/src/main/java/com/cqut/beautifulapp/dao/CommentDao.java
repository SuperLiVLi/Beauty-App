package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Comment)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-09 22:01:03
 */
public interface CommentDao {

    /**
     * 通过技师ID查询对应评价
     * @param id
     * @return
     */
    List<Comment> queryCommentById(Integer id);

    /**
     * 插入评论
     * @param comment
     * @return
     */

    int insert(Comment comment);
}

