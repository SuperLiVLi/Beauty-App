package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.User;
import com.cqut.beautifulapp.dao.UserDao;
import com.cqut.beautifulapp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 11:00:15
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

  @Override
    /**
     * 通过用户名查找项目信息
     */
    public List<Projects> queryOrderByUser(String username) {

        List<Projects> projectList=null;

        if(username!=null&&!username.equals("")){

            projectList=userDao.queryOrderByUser(username);
            return projectList;

        }

        return null;
    }

    /**
     * 通过用户名查找VIP等级
     * @param username
     * @return
     */
    @Override
    public User queryVIPByUser(String username) {
        User VIPInfo=null;

        if(username!=null&&!username.equals("")){

            VIPInfo=userDao.queryVIPByUser(username);
            return VIPInfo;

        }

        return null;


    }

    /**
     * 通过用户名查找用户信息
     * @param username
     * @return
     */
    @Override
    public User queryByUser(String username) {

        User user=null;

        if(username!=null&&!username.equals("")){

            user=userDao.queryByUser(username);
            return user;

        }
        return null;

    }

}
