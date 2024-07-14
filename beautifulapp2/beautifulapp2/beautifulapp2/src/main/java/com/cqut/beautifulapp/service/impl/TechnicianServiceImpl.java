package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.dao.TechnicianDao;
import com.cqut.beautifulapp.dto.Technicians;
import com.cqut.beautifulapp.service.TechnicianService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Technician)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:59:54
 */
@Service("technicianService")
public class TechnicianServiceImpl implements TechnicianService {
    @Resource
    private TechnicianDao technicianDao;

    /**
     * 查询全部技师信息
     * @return
     */

    @Override
    public List<Technicians> queryAll() {

        List<Technicians> technicians = technicianDao.queryAll();
        return technicians;

    }

    /**
     * 通过技师ID查询技师详情信息
     * @param id
     * @return
     */
    @Override
    public List<Technicians> queryByTid(Integer id) {
        List<Technicians> technicians = technicianDao.queryByTid(id);
        return technicians;

    }

    /**
     * 根据技师姓名查找擅长的项目
     * @param name
     * @return
     */
    @Override
    public List<Projects> queryProjectByName(String name) {

        List<Projects> lists = technicianDao.queryProjectByName(name);

        return lists;
    }

    @Override
    public List<Technicians> queryNameByType(String name) {

        List<Technicians> technicians = null;
        /* 处理业务逻辑 */
        if(name!=null&&!name.equals("")){ // 不为空内容地址不为空
            if(name.equals("推荐")){
                technicians = technicianDao.queryAll();
            }
            else{
                // int tid =  projecttypeDao.queryByName(name);
                technicians = technicianDao.queryNameByType(name);
            }
            return technicians;
        }
        return null;
    }
}
