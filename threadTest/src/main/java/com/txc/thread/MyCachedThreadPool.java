package com.txc.thread;

import com.txc.task.LiftOff;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by tanxiaocan on 2016/9/9.
 */
public class MyCachedThreadPool {
    public static void main(String[] args){
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new LiftOff(10));
        }
        es.shutdown();
    }
}
