package com.anonym.wxminiprogram.user.controller;

import com.anonym.wxminiprogram.common.Constants;
import com.anonym.wxminiprogram.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨帆
 * @date 2018/6/25 11:47
 * @desc v1.0.0
 */
@RestController
@Slf4j
public class IndexController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/home", method = RequestMethod.POST, produces = Constants.MIME_JSON)
    public String home() {
        log.warn(">>> hello log");
        return "Hello spring boot!";
    }

    @RequestMapping("/getcity")
    public String getCity() {
        return cityService.get().toString();
    }
}
