package com.anonym.wxminiprogram.customer.side.controller;

import com.anonym.wxminiprogram.common.consts.Constants;
import com.anonym.wxminiprogram.common.vo.PageResultList;
import com.anonym.wxminiprogram.common.vo.ResultCodeEnum;
import com.anonym.wxminiprogram.customer.side.controller.vo.OrderVO;
import com.anonym.wxminiprogram.customer.side.controller.vo.PageReq;
import com.anonym.wxminiprogram.customer.side.domain.Order;
import com.anonym.wxminiprogram.customer.side.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 22:15
 * @apiNote 订单API
 */
@RestController
@RequestMapping(Constants.API_CUSTOMER + "/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 分页加载订单列表
     * @param session
     * @param pageReq
     * @return
     */
    @RequestMapping("/list")
    public PageResultList<OrderVO> loadOrderList(HttpSession session, PageReq pageReq) {
        //TODO 2018/07/04
        Long memberId = /*(Long) session.getAttribute("")*/1L;
        log.info(">>> 加载订单列表，用户id：{}，分页参数：{}", memberId, pageReq);
        PageResultList<OrderVO> vo = new PageResultList<>();
        if (pageReq.getPageNo() == null || pageReq.getPageSize() == null
                || pageReq.getPageNo() <= 0 || pageReq.getPageSize() <= 0) {
            vo.setCode(ResultCodeEnum.INVALID_PARAM.getCode());
            vo.setMsg(ResultCodeEnum.INVALID_PARAM.getMsg());
            return vo;
        }
        // 分页查询
        List<Order> orderList = orderService.listOrderByPage(memberId, pageReq.getPageNo(), pageReq.getPageSize());
        if (CollectionUtils.isEmpty(orderList)) {
            vo.setCode(ResultCodeEnum.EMPTY_DATA.getCode());
            vo.setMsg(ResultCodeEnum.EMPTY_DATA.getMsg());
            return vo;
        }
        // 数据正常，组装数据
        try {
            List<OrderVO> results = new ArrayList<>(orderList.size());
            for (Order order: orderList) {
                OrderVO orderVO = new OrderVO();
                // 订单编号
                orderVO.setOrderId(String.valueOf(order.getOrderId()));
                // 套餐标题
                orderVO.setPacketTitle(order.getFeePacketTitle());
                // 订单状态
                orderVO.setStatus(String.valueOf(order.getStatus()));
                // 下单时间
                String orderTime = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(order.getCreateTime());
                orderVO.setOrderTime(orderTime);
                results.add(orderVO);
            }
            vo.setResults(results);
            vo.setTotal(orderService.queryOrderCount(memberId));
            vo.setPageNo(pageReq.getPageNo());
            vo.setPageSize(pageReq.getPageSize());
            vo.setCode(ResultCodeEnum.NORMAL.getCode());
            vo.setMsg(ResultCodeEnum.NORMAL.getMsg());
        } catch (Exception e) {
            log.error(">>> 加载订单列表失败，用户id：{}，分页参数：{}", memberId, pageReq);
            vo.setCode(ResultCodeEnum.ERROR.getCode());
            vo.setMsg(ResultCodeEnum.ERROR.getMsg());
        }
        return vo;
    }
}
