package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Business;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.BusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Business)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:49:26
 */
@RestController
@RequestMapping("business")
@Api(tags = "商家")
public class BusinessController {
    /**
     * 服务对象
     */
    @Resource
    private BusinessService businessService;

    /**
     * 通过对应Bid查询商家信息
     * @param id
     * @return
     */
    @ApiOperation(value = "queryByBid", notes = "通过对应Bid查询商家信息")
    @ApiImplicitParam(name = "id", value = "项目id")
    @GetMapping("/app/busname/{id}")
    public ResultData queryByBid(@PathVariable Integer id){
        String  name = businessService.queryByBid(id);
        return new ResultData(ResultCode.SUCCESS, name);
    }
}

