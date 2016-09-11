package com.txc.task;

import java.util.concurrent.TimeUnit;

/**
 * Created by tanxiaocan on 2016/9/9.
 */
public class SleepTask implements Runnable {
    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            TimeUnit.MILLISECONDS.sleep(1000);
            long endTime = System.currentTimeMillis();
            System.out.print("休眠的时间：" + (endTime - startTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Thread(new SleepTask()).start();
    }
}
