package com.anonym.wxminiprogram.customer.side.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 21:24
 * @apiNote 订单表对应实体
 */
@Data
@ToString
public class Order implements Serializable {
    private static final long serialVersionUID = 8112160242653769209L;
    /**
     * 订单主键id
     */
    private Long id;
    /**
     * 内部订单编号
     */
    private String orderId;
    /**
     * 套餐标题
     */
    private String feePacketTitle;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 订单创建时间
     */
    private Date createTime;
}
