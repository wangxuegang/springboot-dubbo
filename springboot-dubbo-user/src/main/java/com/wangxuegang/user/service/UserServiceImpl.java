package com.wangxuegang.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.wangxuegang.user.dao.UserDao;
import com.wangxuegang.user.entity.UserEntity;

/**
 * 
 * @类描述：UserServiceImpl
 * @项目名称：springboot-dubbo-user
 * @包名： com.wangxuegang.user.service
 * @类名称：UserServiceImpl
 * @创建人：wangxuegang
 * @创建时间：2019年1月22日上午11:04:53
 * @mail 15510235102@163.com
 * @version v1.0
 */
@Service(version="1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;
	
	@Override
	public int insert(UserEntity record) {
		
		return userDao.insert(record);
	}
	
}
