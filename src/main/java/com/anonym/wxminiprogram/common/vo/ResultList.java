package com.anonym.wxminiprogram.common.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 22:22
 * @apiNote 结果集VO
 */
@Data
@ToString
public class ResultList<T> implements Serializable {
    private static final long serialVersionUID = -8478253546923551753L;

    public ResultList() {
    }

    public ResultList(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
    }

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码描述
     */
    private String msg;
    /**
     * 结果集
     */
    private List<T> results;
}
