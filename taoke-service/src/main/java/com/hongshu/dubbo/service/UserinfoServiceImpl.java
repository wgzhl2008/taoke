package com.hongshu.dubbo.service;

import com.hongshu.dao.common.BaseDao;
import com.hongshu.domain.User;

import java.util.List;

/**
 * Created by zhanglei on 15/3/5.
 */
public class UserinfoServiceImpl extends BaseDao implements UserinfoService{
    public List<User> selectUsers() {
        return sqlSessionTemplate.selectList("sqlmap-user.select");
    }
}
