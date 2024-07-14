package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.entity.Business;
import com.cqut.beautifulapp.dao.BusinessDao;
import com.cqut.beautifulapp.service.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Business)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:49:27
 */
@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessDao businessDao;


    /**
     * 通过Bid查询相应的商家名称
     * @param id
     * @return
     */
    @Override
    public String queryByBid(Integer id) {
        String name = businessDao.queryByBid(id);
        return name;
    }
}
