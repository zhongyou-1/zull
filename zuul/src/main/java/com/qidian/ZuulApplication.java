package com.qidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/***
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年12月3日下午10:21:26
 * @功能描述：
 */
@EnableZuulProxy //开启zuul：
@EnableEurekaClient // 启用服务注册与发现 （声明是个提供者）
@SpringBootApplication // 标明本类 启动类
public class ZuulApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
