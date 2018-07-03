package com.anonym.wxminiprogram.common.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 22:31
 * @apiNote 单结果VO
 */
@Data
@ToString
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -1687277359773010478L;

    public Result() {
    }

    public Result(ResultCodeEnum resultCodeEnum) {
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
     * 结果
     */
    private T result;
}
