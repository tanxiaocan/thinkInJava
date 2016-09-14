package com.txc.thread.node3.eg1;

import com.txc.common.BaseInterface;
import com.txc.common.utils.ExecutorsUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g,int id){
        this.generator = g;
        this.id = id;
    }
    @Override
    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            if(val % 2!=0){
                System.out.println(val + " not even!");
                generator.cancel();//cancels all evenCheckers
            }else {
                System.out.println(val + " is even");
            }
        }
    }
    public static class EvenCheckerFactory implements ThreadFactory{
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        }
    }
    public static void test(IntGenerator intGenerator,int count) {
        ExecutorService executorService = Executors.newCachedThreadPool(new EvenCheckerFactory());
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(intGenerator,10));
        }
        executorService.shutdown();
    }
}
