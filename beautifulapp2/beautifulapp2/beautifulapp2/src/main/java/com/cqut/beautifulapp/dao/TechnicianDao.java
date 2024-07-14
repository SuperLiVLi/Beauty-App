package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.dto.Technicians;

import java.util.List;

/**
 * (Technician)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:59:53
 */
public interface TechnicianDao {

    /**
     * 查询所有技师信息
     * @return
     */
    List<Technicians> queryAll();

    /**
     * 通过技师ID查询具体技师信息
     * @param id
     * @return
     */
    List<Technicians>  queryByTid(Integer id);

    /**
     * 根据技师姓名查找擅长的项目
     * @param name
     * @return
     */
    List<Projects> queryProjectByName(String name);

    /**
     * 通过项目类型ID查找对应技师名称
     * @param name
     * @return
     */
    List<Technicians> queryNameByType(String name);
}

