package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-07-05 11:00:15
 */
public interface UserService {


    /**
     * 通过用户名查找订单信息
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
