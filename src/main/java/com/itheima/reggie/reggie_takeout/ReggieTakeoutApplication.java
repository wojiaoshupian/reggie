package com.itheima.reggie.reggie_takeout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ReggieTakeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReggieTakeoutApplication.class, args);
		 log.info("项目启动成功");
	}

}
