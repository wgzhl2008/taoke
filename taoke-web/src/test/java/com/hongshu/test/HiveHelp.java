package com.hongshu.test;

import java.sql.*;

/**
 * Created by zhanglei on 14/12/23.
 */
public class HiveHelp {

    public static void main(String[] args) {
        try {
            Connection conn= getConn();
            System.out.println(conn.getMetaData().getDatabaseProductName()+"\t"+ conn.getMetaData().getDatabaseProductVersion());
            String tbName ="hiveTestTable";
            String sql = "create table "+tbName+" (key int,value string) row format delimited fields terminated by '\t' ";
            sql = "show tables '"+tbName+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("执行showtable");
            ResultSet rs =ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            sql ="describe "+tbName;
            ps=conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
            String path = "/home/hadoop/hive_data.txt";
            sql = "load data local inpath '"+path+"' into table "+tbName;
            sql= "select * from "+tbName;
            ps=conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            }
            conn.close();
            ps.close();
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static Connection getConn() throws SQLException, ClassNotFoundException {
        String url="jdbc:hive://10.10.76.171:10000/default";
        String user="";
        String password="";
        Class.forName("org.apache.hadoop.hive.jdbc.HiveDriver");
        Connection conn = DriverManager.getConnection(url, user, password);

        return conn;
    }
}
