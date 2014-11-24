package com.hongshu.dao.common;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhanglei on 14/11/18.
 */
@Component
public class BaseDao extends SqlSessionDaoSupport{
    @Resource(name = "sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public SqlSessionTemplate sqlSessionTemplate;
    private SqlSession batchSession;
    private static final int BATCH_NUM = 10000;

    @PostConstruct
    public void SqlSessionFactory() {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public int batchInsert(String statement, List<?> list) {
        batchSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        int i = 0;
        for (int cnt = list.size(); i < cnt; i++) {
            batchSession.insert(statement, list.get(i));
            if ((i + 1) % BATCH_NUM == 0) {
                batchSession.flushStatements();
            }
        }
        batchSession.flushStatements();
        batchSession.close();
        return i;
    }

    public int batchUpdate(String statement, List<?> list) {
        batchSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        int i = 0;
        for (int cnt = list.size(); i < cnt; i++) {
            batchSession.update(statement, list.get(i));
            if ((i + 1) % BATCH_NUM == 0) {
                batchSession.flushStatements();
            }
        }
        batchSession.flushStatements();
        batchSession.close();
        return i;
    }

    public int batchDelete(String statement, List<?> list) {
        batchSession = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        int i = 0;
        for (int cnt = list.size(); i < cnt; i++) {
            batchSession.delete(statement, list.get(i));
            if ((i + 1) % BATCH_NUM == 0) {
                batchSession.flushStatements();
            }
        }
        batchSession.flushStatements();
        batchSession.close();
        return i;
    }
}
