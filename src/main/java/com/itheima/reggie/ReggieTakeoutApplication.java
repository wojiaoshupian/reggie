package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.itheima.reggie.mapper")
public class ReggieTakeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReggieTakeoutApplication.class, args);
		 log.info("项目启动成功");
	}

}
