package com.hongshu.dao;

import com.hongshu.domain.SalaryDetail;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhanglei on 14/11/18.
 */
@Component
public interface SalaryDetailDao {
    public void insert(SalaryDetail salaryDetail);
    public void insert(List<SalaryDetail> salaryDetails);

    public List<SalaryDetail> select();
}
