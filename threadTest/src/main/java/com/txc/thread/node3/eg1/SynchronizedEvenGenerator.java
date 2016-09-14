package com.txc.thread.node3.eg1;

import com.txc.common.BaseInterface;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public class SynchronizedEvenGenerator extends IntGenerator implements BaseInterface{
    private Object lockObj = new Object();//锁对象
    private int currentEvenValue = 0;
    @Override
    public int next() {
        synchronized (lockObj){
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }
    }

    @Override
    public void test() {
        long startTime = System.currentTimeMillis();
        EvenChecker.test(new SynchronizedEvenGenerator(),10);
        while (true){
            long endTime = System.currentTimeMillis();
            if(endTime-startTime>5000){
                System.out.println("system exit ok");
                System.exit(0);
            }
        }
    }
}
