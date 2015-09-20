package com.hongshu.test;

import java.io.*;

/**
 * Created by zhanglei on 15/1/23.
 */
public class GetMac {
    public static void main(String[] args) {
        System.out.println(getMAC("10.10.76.66"));
    }
    public static String getMAC() {
        String mac = null;
        try {
            Process pro = Runtime.getRuntime().exec("cmd.exe /c ipconfig/all");

            InputStream is = pro.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String message = br.readLine();

            int index = -1;
            while (message != null) {
                if ((index = message.indexOf("Physical Address")) > 0) {
                    mac = message.substring(index + 36).trim();
                    break;
                }
                message = br.readLine();
            }
            System.out.println(mac);
            br.close();
            pro.destroy();
        } catch (IOException e) {
            System.out.println("Can't get mac address!");
            return null;
        }
        return mac;
    }
    // 运行速度【慢】
    public static String getMAC(String ip) {
        String str = null;
        String macAddress = null;
        try {
            Process p = Runtime.getRuntime().exec("nbtstat -a " + ip);
            InputStreamReader ir = new InputStreamReader(p.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            for (; true;) {
                str = input.readLine();
                if (str != null) {
                    if (str.indexOf("MAC Address") > 1) {
                        macAddress = str
                                .substring(str.indexOf("MAC Address") + 14);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
            return null;
        }
        return macAddress;
    }
}
