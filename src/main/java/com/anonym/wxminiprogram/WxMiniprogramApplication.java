package com.anonym.wxminiprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class WxMiniprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxMiniprogramApplication.class, args);
	}
}
