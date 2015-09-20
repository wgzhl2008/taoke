package com.hongshu.dao;

import org.springframework.stereotype.Component;

/**
 * Created by zhanglei on 14/12/15.
 */
@Component
public interface UserDao {
    public void insert(int id,String name);
}
