package com.hongshu.util;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;

/**
 * Description:
 *
 * @author HongShu
 * @version 1.0.0
 *          2014年8月14日 上午10:28:30
 */
public class HttpUtil {
    public static GetMethod initGetMethod(String uri, String ip) {
        GetMethod getMethod = new GetMethod(uri);
        getMethod.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        getMethod.setRequestHeader("Connection", "close");
        getMethod.setRequestHeader("Cache-Control", "no-cache");
        getMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:32.0) Gecko/20100101 Firefox/32.0");
        getMethod.setRequestHeader("x-forwarded-for", ip);
        //设置referer值
        getMethod.setRequestHeader("Referer", "http://www.thsyxx.com:81/vote/index.asp");
        return getMethod;
    }

    public static HttpClient initHttpClient() {
        HttpClient client = new HttpClient();
        HttpConnectionManagerParams params = client.getHttpConnectionManager().getParams();
        params.setConnectionTimeout(1000 * 10);//连接超时时间
        params.setSoTimeout(1000 * 15);//读取超时时间
        params.setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

        //设置代理
        client.getHostConfiguration().setProxy("10.10.76.253", 808);
        // UsernamePasswordCredentials creds = new UsernamePasswordCredentials("chan", "123456");
        //client.getState().setProxyCredentials(AuthScope.ANY, creds);
        return client;
    }
}
