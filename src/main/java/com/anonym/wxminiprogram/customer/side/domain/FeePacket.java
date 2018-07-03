package com.anonym.wxminiprogram.customer.side.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 20:45
 * @apiNote 费率套餐实体
 */
@Data
@ToString
public class FeePacket implements Serializable {
    private static final long serialVersionUID = -3106815235779148296L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 价格，单位：分
     */
    private Integer price;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 描述信息
     */
    private String detail;
}
