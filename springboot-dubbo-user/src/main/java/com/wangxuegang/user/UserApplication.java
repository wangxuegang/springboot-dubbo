package com.wangxuegang.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 * @类描述：程序启动入口
 * @项目名称：springboot-dubbo-user
 * @包名： com.wangxuegang.user
 * @类名称：UserApplication
 * @创建人：wangxuegang
 * @创建时间：2019年1月23日上午11:15:00
 * @mail 15510235102@163.com
 * @version v1.0
 */
@SpringBootApplication
public class UserApplication extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
}
