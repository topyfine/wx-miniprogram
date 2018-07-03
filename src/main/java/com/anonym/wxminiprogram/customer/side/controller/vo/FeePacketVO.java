package com.anonym.wxminiprogram.customer.side.controller.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 22:27
 * @apiNote 费用套餐展示VO
 */
@Data
@ToString
public class FeePacketVO implements Serializable {
    private static final long serialVersionUID = 1092527089427147057L;
    /**
     * 套餐id
     */
    private String packetId;
    /**
     * 标题
     */
    private String title;
    /**
     * 价格，单位：元
     */
    private String price;
    /**
     * 描述信息
     */
    private String detail;
}
