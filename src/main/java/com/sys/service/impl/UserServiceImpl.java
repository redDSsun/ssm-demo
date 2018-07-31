package com.sys.service.impl;

import org.springframework.stereotype.Service;
import com.sys.dao.UserDao;
import com.sys.service.UserService;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public String getPassword(String name){
        System.out.println(userDao.getPassword(name));
       return userDao.getPassword(name);
    }
}
