package com.anonym.wxminiprogram.common.vo;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 22:41
 * @apiNote 状态码枚举
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    NORMAL("0", "success"),
    /**
     * 失败
     */
    ERROR("1", "fail"),
    /**
     * 未查询到结果
     */
    EMPTY_DATA("2", "empty data"),
    /**
     * 参数不合法
     */
    INVALID_PARAM("3", "invalid param")
    ;

    ResultCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码描述
     */
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
