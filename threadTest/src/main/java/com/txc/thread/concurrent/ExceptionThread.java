package com.txc.thread.concurrent;

import com.txc.common.BaseInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by xiaocantan on 2016/9/12.
 */
public class ExceptionThread implements Runnable,BaseInterface {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by:" + t);
        System.out.println("eh:" + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }

    @Override
    public void test() {
//        ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
//        executorService.execute(new ExceptionThread());

        Thread thread = new Thread(new ExceptionThread());
        thread.setUncaughtExceptionHandler(new MyUnCaughtExceptionHandler());
        thread.start();
    }

    class MyUnCaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.print("catch:" + e);
        }
    }

    class HandlerThreadFactory implements ThreadFactory{
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setUncaughtExceptionHandler(new MyUnCaughtExceptionHandler());
            System.out.println("eh:" + thread.getUncaughtExceptionHandler());
            return thread;
        }
    }
}
