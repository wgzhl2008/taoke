package com.hongshu.service;

import com.hongshu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanglei on 14/12/15.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void insert(int id,String name){
        this.userDao.insert(id,name);
    }
}
