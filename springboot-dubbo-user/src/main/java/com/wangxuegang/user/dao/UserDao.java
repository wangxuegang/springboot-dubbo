package com.wangxuegang.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wangxuegang.user.entity.UserEntity;

/**
 * 
 * @类描述：UserDao 
 * @项目名称：springboot-dubbo-user
 * @包名： com.wangxuegang.user.dao
 * @类名称：UserDao
 * @创建人：wangxuegang
 * @创建时间：2019年1月22日上午11:08:26
 * @mail 15510235102@163.com
 * @version v1.0
 */
@Mapper
public interface UserDao {

    int insert(UserEntity record);
    
}
