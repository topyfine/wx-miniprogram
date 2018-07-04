package com.anonym.wxminiprogram.customer.side.controller.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 22:23
 * @apiNote 分页请求参数
 */
@Data
@ToString
public class PageReq {
    private Integer pageNo;
    private Integer pageSize;
}
