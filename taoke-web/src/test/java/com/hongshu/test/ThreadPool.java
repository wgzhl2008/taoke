package com.hongshu.test;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhanglei on 15/7/5.
 */
public class ThreadPool extends Thread {
    private  int index;

    public ThreadPool(int i) {
        this.index=i;
    }

    @Override
    public void run() {
        try {
            System.out.println("["+this.index+"] start ...." );
            Thread.sleep((int)Math.random()*10000);
            System.out.println("["+this.index+"] end ...." );
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue linkedblockqueue;
        LinkedBlockingDeque linkedBlockingDeque;
        ReentrantLock reentrantLock;
        for(int i =0;i<10;i++){
            service.execute(new ThreadPool(i));
//            service.submit(new ThreadPool(i));
        }
        System.out.println("submit finish");
        service.shutdown();
    }
}
