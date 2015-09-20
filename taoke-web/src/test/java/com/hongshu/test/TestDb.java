package com.hongshu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by zhanglei on 14/12/16.
 */
public class TestDb {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/taoke?useUnicode=true&characterEncoding=utf-8&autoReconnect=true","root","123456");
            String sql="insert into user(username,password) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "张磊会平河南的");
            ps.setString(2, "中国人民的");
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
