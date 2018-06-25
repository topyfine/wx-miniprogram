package com.anonym.wxminiprogram.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 杨帆
 * @date 2018/6/25 17:44
 * @desc v1.0.0
 */
@Data
@ToString
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String state;
    private String country;
    private String testCaml;
}
