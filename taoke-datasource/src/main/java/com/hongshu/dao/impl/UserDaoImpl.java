package com.hongshu.dao.impl;

import com.hongshu.dao.UserDao;
import com.hongshu.dao.common.BaseDao;
import com.hongshu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanglei on 14/12/15.
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public void insert(int id, String name) {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("id",id);
        params.put("name",name);
        User user = new User();
        user.setId(id);
        user.setName(name);
        super.sqlSessionTemplate.insert("sqlmap-user.insert",user);
//        this.getSqlSession().insert("sqlmap-user.insert",user);
    }
}
