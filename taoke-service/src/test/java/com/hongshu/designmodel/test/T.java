package com.hongshu.designmodel.test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by zhanglei on 15/1/23.
 */
public class T implements TestModel {
    @Override
    public void getInfo0() {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        };
    }

    @Override
    public void getInfo() {

    }
}
