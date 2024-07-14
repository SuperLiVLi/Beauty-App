package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.dto.Technicians;

import java.util.List;

/**
 * (Technician)表服务接口
 *
 * @author makejava
 * @since 2022-07-05 10:59:54
 */
public interface TechnicianService {

    /**
     * 查询所有技师的信息
     * @return
     */
    List<Technicians> queryAll();

    /**
     * 根据技师ID查询具体技师信息
     * @param id
     * @return
     */
    List<Technicians> queryByTid(Integer id);

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
