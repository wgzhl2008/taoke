package com.hongshu.util;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;


public class Test {

    private static GetMethod getMethod;


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            test(i);
    }

    public static void test(int i) {
        String ip = null;
        Random r = new Random();

        int headIp = r.nextInt(248);
        if (headIp == 10 || headIp == 172 || headIp == 192 || headIp == 0) return;
        headIp = 183;
        ip = headIp + "." + 128 + "." + r.nextInt(249) + "." + r.nextInt(240);

        String url = "http://www.hzbus.cn/Page/LineSearch.aspx?flinename=";

        try {
            url = url + URLEncoder.encode("113路", "utf8");
            //http://www.hzbus.cn/Page/LineSearch.aspx?flinename=113%E8%B7%AF
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        HttpClient client = HttpUtil.initHttpClient();
        getMethod = HttpUtil.initGetMethod(url, ip);

        try {
            long t = System.currentTimeMillis();
            int status = client.executeMethod(getMethod);
            if (status == HttpStatus.SC_OK) {
                System.out.println(i + "\t" + ip + "\t success!");
                System.out.println(getMethod.getResponseBodyAsString());
            } else {
                System.out.println("error:" + getMethod.getStatusLine());
            }
            Thread.sleep((3 + r.nextInt(20)) * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getMethod.releaseConnection();
        }


    }
}
