package com.anonym.wxminiprogram.customer.side.controller;

import com.anonym.wxminiprogram.common.consts.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/18 23:21
 * @apiNote
 */
@RestController
@RequestMapping(Constants.API_LOGIN)
@Slf4j
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        SecurityContextHolder.getContext()
                .setAuthentication(new UsernamePasswordAuthenticationToken("visitor", "123456"));
        log.info(">>> 登录成功");
        return "login success";
    }

    @RequestMapping("/tologin")
    public String toLogin() {
        log.info(">>> 需要登陆");
        return "need login";
    }
}
