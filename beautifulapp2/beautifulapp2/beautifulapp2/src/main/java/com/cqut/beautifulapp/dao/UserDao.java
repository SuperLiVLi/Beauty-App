package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 11:00:15
 */
public interface UserDao {

    /**
     * 通过用户名查找项目信息
     * @param username
     * @return
     */
    List<Projects> queryOrderByUser(String username);

    /**
     * 通过用户名查找VIP等级
     * @param username
     * @return
     */
    User queryVIPByUser(String username);


    /**
     * 通过用户名查找用户信息
     * @param username
     * @return
     */
    User queryByUser(String username);

}

