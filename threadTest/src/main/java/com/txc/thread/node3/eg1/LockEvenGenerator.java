package com.txc.thread.node3.eg1;

import com.txc.common.BaseInterface;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public class LockEvenGenerator extends IntGenerator implements BaseInterface{
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            System.out.println("当前线程：" + Thread.currentThread().getName());
//            throw new RuntimeException();
            return currentEvenValue;
        }finally {
            System.out.println("clean all post processor");
            lock.unlock();
//            return 6;
        }
    }

    @Override
    public void test() {
        long startTime = System.currentTimeMillis();
        EvenChecker.test(new LockEvenGenerator(),10);
        while (true){
            long endTime = System.currentTimeMillis();
            if(endTime-startTime>5000){
                System.out.println("system exit ok");
                System.exit(0);
            }
        }
    }
}
