package com.hongshu.test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by zhanglei on 15/1/29.
 */
public class JsoupHtmlDemo {
    public static void main(String[] args) {
        Document document = null;
        try {
            Connection connection = Jsoup.connect("http://hangzhou.8684.cn/so.php?k=pp&q=3%C2%B7");
            connection.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:32.0) Gecko/20100101 Firefox/32.0");
            connection.header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            connection.header("Connection","close");
            connection.header("Cache-Control", "no-cache");
            connection.timeout(1000*10);
            document = connection.get();
            System.out.println(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
