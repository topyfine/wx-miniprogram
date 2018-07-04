package com.anonym.wxminiprogram.common.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 23:41
 * @apiNote 分页结果集VO
 */
@Data
@ToString
public class PageResultList<T> extends ResultList<T> {
    private static final long serialVersionUID = 2193611734966177929L;
    /**
     * 结果总数
     */
    private Integer total;
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 分页大小
     */
    private Integer pageSize;
}
