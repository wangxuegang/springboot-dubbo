package com.wangxuegang.user.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangxuegang.user.entity.UserEntity;
import com.wangxuegang.user.service.UserService;

/**
 * 
 * @类描述：UserController
 * @项目名称：springboot-dubbo-controller
 * @包名： com.wangxuegang.user.controller
 * @类名称：UserController
 * @创建人：wangxuegang
 * @创建时间：2019年1月22日下午5:13:24
 * @mail 15510235102@163.com
 * @version v1.0
 */
@RestController
public class UserController {
	
	/** 设置 dubbo 超时时间为 5 秒 */
	@Reference(version = "1.0.0",timeout = 5000)
	private UserService userService;
	
	@GetMapping("/test")
	public Map<String,Object> logout(HttpServletRequest httpReq, HttpServletResponse httpRsp){
		
		Map<String,Object> map = new HashMap<String, Object>();
		UserEntity user = new UserEntity();
		user.setCreateDate(new Date());
		user.setEmail("123@163.com");
		user.setLoginName("wangxuegang");
		user.setPassword("111111");
		user.setPhone("15510235102");
		user.setUserName("王雪刚");
		int count = userService.insert(user);
		map.put("success", count);
		return map;
		
	}
	
}
