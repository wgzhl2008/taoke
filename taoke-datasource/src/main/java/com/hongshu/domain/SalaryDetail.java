package com.hongshu.domain;

import java.io.Serializable;

/**
 * Created by zhanglei on 14/11/18.
 */
public class SalaryDetail implements Serializable{
    private Integer id ;
    private Integer timeId;
    private Integer employeeId;
    private Integer money;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTimeId() {
        return timeId;
    }
    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getMoney() {
        return money;
    }
    public void setMoney(Integer money) {
        this.money = money;
    }
}
