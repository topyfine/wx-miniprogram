package com.anonym.wxminiprogram.customer.side.controller.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 22:17
 * @apiNote 订单展示VO
 */
@Data
@ToString
public class OrderVO implements Serializable {
    private static final long serialVersionUID = -4108214945230660535L;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 套餐标题
     */
    private String packetTitle;
    /**
     * 下单时间
     */
    private String orderTime;
    /**
     * 订单状态
     */
    private String status;
}
