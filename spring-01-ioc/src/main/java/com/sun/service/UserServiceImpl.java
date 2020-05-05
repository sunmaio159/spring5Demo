package com.sun.service;

import com.sun.dao.UserDao;
import com.sun.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //修改之前 对象有程序员创建
//    private UserDao userDao = new UserDaoImpl();

    //修改之后，对象用用户定义创建
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
