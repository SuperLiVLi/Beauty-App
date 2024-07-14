package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Business;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Business)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:49:27
 */
public interface BusinessDao {

    /**
     * 通过Bid查询对应的商家名称
     * @param id
     * @return
     */
    String queryByBid(Integer id);
}

