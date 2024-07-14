package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.entity.Business;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Business)表服务接口
 *
 * @author makejava
 * @since 2022-07-05 10:49:27
 */
public interface BusinessService {
    /**
     * 通过Bid来查询对应的商家信息
     * @param id
     * @return
     */
    String queryByBid(Integer id);
}
