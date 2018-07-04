package com.anonym.wxminiprogram.customer.side.service;

import com.anonym.wxminiprogram.customer.side.domain.Order;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 21:53
 * @apiNote 订单服务接口
 */
public interface OrderService {
    /**
     * 分页查询订单
     * @param memberId 用户id
     * @param pageNo 页码
     * @param pageSize 分页大小
     * @return 订单列表
     */
    List<Order> listOrderByPage(Long memberId, int pageNo, int pageSize);

    /**
     * 查询用户订单数量
     * @param memberId 用户id
     * @return 订单数量
     */
    Integer queryOrderCount(Long memberId);
}
