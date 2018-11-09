package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类，标识是一个springboot应用程序
//这个类必须放在所有运行服务 @Controller @Service父级目标，死规矩
@SpringBootApplication
//对mybatis接口进行扫描
@MapperScan(basePackages="com.tedu.mapper")
public class RunApp {
	public static void main(String[] args) {
		//启动整个程序，暗含启动tomcat
		SpringApplication.run(RunApp.class, args);
	}
	

}
