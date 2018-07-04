package com.anonym.wxminiprogram.customer.side.service.impl;

import com.alibaba.fastjson.JSON;
import com.anonym.wxminiprogram.common.util.PageUtils;
import com.anonym.wxminiprogram.customer.side.dao.OrderMapper;
import com.anonym.wxminiprogram.customer.side.domain.Order;
import com.anonym.wxminiprogram.customer.side.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 21:56
 * @apiNote 订单服务接口
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 分页查询订单
     *
     * @param memberId 用户id
     * @param pageNo   页码
     * @param pageSize 分页大小
     * @return 订单列表
     */
    @Override
    public List<Order> listOrderByPage(Long memberId, int pageNo, int pageSize) {
        log.info(">>> 查询订单列表，用户id：{}，页码：{}，每页：{}", memberId, pageNo, pageSize);
        try {
            int offset = PageUtils.getOffset(pageNo, pageSize);
            List<Order> orderList = orderMapper.selectOrderByPage(memberId, offset, pageSize);
            log.info(">>> 查询结果：{}", JSON.toJSONString(orderList));
            return orderList;
        } catch (Exception e) {
            log.error(">>> 查询订单列表失败，用户id：{}，页码：{}，每页：{}，异常：{}", memberId, pageNo, pageSize,
                    e.getLocalizedMessage(), e);
            return null;
        }
    }

    /**
     * 查询用户订单数量
     *
     * @param memberId 用户id
     * @return 订单数量
     */
    @Override
    public Integer queryOrderCount(Long memberId) {
        log.info(">>> 查询用户订单数量，用户id：{}", memberId);
        try {
            Integer count = orderMapper.countOrder(memberId);
            log.info(">>> 查询结果：{}", count);
            return count;
        } catch (Exception e) {
            log.error(">>> 查询用户订单数量失败，用户id：{}，异常：{}", memberId, e.getLocalizedMessage(), e);
            return null;
        }
    }
}
