package com.txc.thread.concurrent;

import com.txc.task.MyCallable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by tanxiaocan on 2016/9/9.
 */
public class MyFixedThreadPool {
    public static void main(String args[]){
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<String> result = es.submit(new MyCallable());
        for (int i = 0; i < 100; i++) {
            System.out.println("mainThread" + i);
            Thread.yield();
        }
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            es.shutdown();
        }
    }
}
