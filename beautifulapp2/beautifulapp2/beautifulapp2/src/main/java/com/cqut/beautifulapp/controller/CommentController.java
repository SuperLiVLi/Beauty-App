package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.entity.Comment;
import com.cqut.beautifulapp.entity.Order;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.CommentService;
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
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2022-07-09 22:01:03
 */
@RestController
@RequestMapping("comment")
@Api(tags = "评论")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    /**
     * 通过技师ID查询评价
     * @param id
     * @return
     */
    @ApiOperation(value = "queryCommentById", notes = "通过技师ID查询对应评论内容")
    @ApiImplicitParam(name = "id", value = "技师ID")
    @GetMapping("/comment/{id}")
    public ResultData queryCommentById(Integer id){
        List<Comment> lists = commentService.queryCommentById(id);
        ResultData resultData = new ResultData(ResultCode.SUCCESS, lists);

        return resultData;
    }


    /**
     * 添加评论
     * @param comment
     * @return
     */
    @ApiOperation(value = "Insert", notes = "添加评论")
    @ApiImplicitParam(name = "comment", value = "订单对象")
    @PostMapping("/insert/comment")
    public ResultData Insert(@RequestBody Comment comment){

        // 处理请求
        Boolean result = commentService.insert(comment);
        if(result){
            return new ResultData(ResultCode.SUCCESS);
        }
        else{
            return new ResultData(ResultCode.FAILED);
        }
    }
}

