package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.User;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-07-05 11:00:15
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @ApiOperation(value="queryOrderByUser",notes="通过用户名查找订单信息")
    @ApiImplicitParam(name="username",value="用户名")
    @GetMapping("/order/{username}")

    public ResultData queryOrderByUser(@PathVariable String username){

        //处理请求
        List<Projects> projectList= userService.queryOrderByUser(username);
        ResultData resultData=new ResultData(ResultCode.FAILED,projectList);
        if(projectList !=null){
            resultData=new ResultData(ResultCode.SUCCESS,projectList);
        }
        return resultData;
    }


    @ApiOperation(value="queryVIPByUser",notes="通过用户名查找VIP信息")
    @ApiImplicitParam(name="username",value="用户名")
    @GetMapping("/vip/{username}")

    public ResultData queryVIPByUser(@PathVariable String username){

        //处理请求
        User VIPInfo= userService.queryVIPByUser(username);
        ResultData resultData=new ResultData(ResultCode.FAILED,VIPInfo);
        if(VIPInfo !=null){
            resultData=new ResultData(ResultCode.SUCCESS,VIPInfo);
        }
        return resultData;
    }


    @ApiOperation(value="queryByUser",notes="通过用户名查找用户信息")
    @ApiImplicitParam(name="username",value="用户名")
    @GetMapping("/user/{username}")

    public ResultData queryByUser(@PathVariable String username) {

        //处理请求
        User user = userService.queryByUser(username);
        ResultData resultData = new ResultData(ResultCode.FAILED, user);
        if (user != null) {
            resultData = new ResultData(ResultCode.SUCCESS, user);
        }
        return resultData;
    }


}

