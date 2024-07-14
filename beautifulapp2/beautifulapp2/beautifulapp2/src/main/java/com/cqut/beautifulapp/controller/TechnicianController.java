package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.dto.Technicians;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.TechnicianService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Technician)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:59:53
 */
@RestController
@RequestMapping("technician")
@Api(tags = "技师")
public class TechnicianController {
    /**
     * 服务对象
     */
    @Resource
    private TechnicianService technicianService;

    /**
     * 查询所有技师的详情信息
     * @return
     */
    @ApiOperation(value="queryAll", notes = "查询所有技师信息")
    @GetMapping("/tech/")
     public ResultData queryAll(){
         List<Technicians> technicians = technicianService.queryAll();
         ResultData resultData = new ResultData(ResultCode.SUCCESS, technicians);
         return resultData;
     }

    /**
     * 根据技师ID查询技师信息
     * @param id
     * @return
     */
    @ApiOperation(value = "queryByTid", notes = "根据技师ID查询详情信息")
    @ApiImplicitParam(name = "id", value = "技师ID")
    @GetMapping("/detail/{id}")
     public ResultData queryByTid(@PathVariable Integer id){
       List<Technicians> technician = technicianService.queryByTid(id);
        ResultData resultData = new ResultData(ResultCode.SUCCESS, technician);
        return resultData;
     }

    /**
     * 根据技师姓名查找擅长的项目
     * @param name
     * @return
     */
    @ApiOperation(value = "queryProjectByName", notes = "通过技师姓名查找擅长的项目")
    @ApiImplicitParam(name = "name", value = "技师姓名")
    @GetMapping("/advantage/{name}")
     public ResultData queryProjectByName(@PathVariable String name){
         List<Projects> lists  = technicianService.queryProjectByName(name);
         ResultData resultData = new ResultData(ResultCode.SUCCESS, lists);

         return resultData;
     }

    /**
     * 通过项目类型ID查找对应技师名称
     * @param name
     * @return
     */
    @ApiOperation(value = "queryNameByType", notes = "根据项目类型查询技师名")
    @ApiImplicitParam(name = "name", value = "项目类型名")
    @GetMapping("/name/{name}")
     public ResultData queryNameByType(@PathVariable String name){
        List<Technicians> technicians = technicianService.queryNameByType(name);
        ResultData resultData = new  ResultData(ResultCode.SUCCESS, technicians);

        return resultData;
     }
}

