package com.hongshu.service;

import com.hongshu.dao.SalaryDetailDao;
import com.hongshu.domain.SalaryDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanglei on 14/11/18.
 */
@Service
public class SalaryDetailService {
    @Autowired
    private SalaryDetailDao salaryDetailDao;

    public void insert(SalaryDetail salaryDetail) {
        this.salaryDetailDao.insert(salaryDetail);

    }

    public List<SalaryDetail> select(){
        return this.salaryDetailDao.select();
    }

    public void insert(List<SalaryDetail> salaryDetails) {
        this.salaryDetailDao.insert(salaryDetails);
    }
}
