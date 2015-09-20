package com.hongshu.domain;

import java.io.Serializable;

/**
 * Created by zhanglei on 14/12/15.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
