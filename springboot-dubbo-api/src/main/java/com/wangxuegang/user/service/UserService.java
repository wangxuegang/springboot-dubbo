package com.wangxuegang.user.service;

import com.wangxuegang.user.entity.UserEntity;

/**
 * 
 * @类描述：UserService
 * @项目名称：springboot-dubbo-api
 * @包名： com.wangxuegang.user.service
 * @类名称：UserService
 * @创建人：wangxuegang
 * @创建时间：2019年1月22日上午10:42:09
 * @mail 15510235102@163.com
 * @version v1.0
 */
public interface UserService {
	
	public int insert(UserEntity record);
}
