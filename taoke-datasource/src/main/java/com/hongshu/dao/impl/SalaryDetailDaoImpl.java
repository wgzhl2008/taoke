package com.hongshu.dao.impl;

import com.hongshu.dao.SalaryDetailDao;
import com.hongshu.dao.common.BaseDao;
import com.hongshu.domain.SalaryDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhanglei on 14/11/18.
 */
@Repository
public class SalaryDetailDaoImpl extends BaseDao implements SalaryDetailDao{
    public void insert(SalaryDetail salaryDetail) {
        this.getSqlSession().insert("sqlmap-salarydetail.insert", salaryDetail);
    }

    public void insert(List<SalaryDetail> salaryDetails) {
        this.batchInsert("sqlmap-salarydetail.insert", salaryDetails);
    }

    public List<SalaryDetail> select() {
        return sqlSessionTemplate.selectList("sqlmap-salarydetail.select");
    }
}
