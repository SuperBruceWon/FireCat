package com.zw;	//springboot启动类必须有包路径

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

//MapperScan mybatis扫描所有的接口，自动创建它的实现类
@MapperScan(basePackages="com.zw.mapper")
public class RunApp {
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
