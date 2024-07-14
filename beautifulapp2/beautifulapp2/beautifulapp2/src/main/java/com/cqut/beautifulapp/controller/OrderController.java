package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.entity.Order;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:58:46
 */
@RestController
@RequestMapping("order")
@Api(tags = "订单")

public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    @ApiOperation(value = "Insert", notes = "添加预约订单")
    @ApiImplicitParam(name = "order", value = "订单对象")
    @PostMapping("/app/order")
    public ResultData Insert(@RequestBody Order order){

        // 处理请求
        Boolean result = orderService.insert(order);
        if(result){
            return new ResultData(ResultCode.SUCCESS);
        }
        else{
            return new ResultData(ResultCode.FAILED);
        }
    }

}

