package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Project;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.ProjectService;
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
 * (Project)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:59:21
 */
@RestController
@RequestMapping("project")
@Api(tags = "项目")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;

    /**
     * 通过项目类型查询项目信息
     * @param name
     * @return
     */
    @ApiOperation(value = "queryProjects", notes = "通过项目导航栏的类型名称查询对应项目信息")
    @ApiImplicitParam(name = "name", value = "项目类型名")
    @GetMapping("/pro/{name}")
    public ResultData queryProjects(@PathVariable String name){

        // 处理请求
        List<Projects> projectList = projectService.queryProjects(name);

        ResultData resultData = new ResultData(ResultCode.SUCCESS, projectList);

        return resultData;
    }

    /**
     * 通过项目ID查询单条项目信息
     * @param id
     * @return
     */
    @ApiOperation(value = "queryByPid", notes = "通过项目的ID查找对应的项目的详情信息")
    @ApiImplicitParam(name = "id", value = "项目ID")
    @GetMapping("/detail/{id}")
    public ResultData queryByPid(@PathVariable Integer id){

       // 处理请求

        Projects projects = projectService.queryByPid(id);
        ResultData resultData = new ResultData(ResultCode.SUCCESS,projects);
        return resultData;
    }
}

