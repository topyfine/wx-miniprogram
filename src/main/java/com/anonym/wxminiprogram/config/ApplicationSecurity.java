package com.anonym.wxminiprogram.config;

import com.anonym.wxminiprogram.common.consts.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/18 23:34
 * @apiNote 配置spring security过滤规则
 */
@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
    /**
     * custom
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 登录放行
                .antMatchers(Constants.API_LOGIN + "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
}
