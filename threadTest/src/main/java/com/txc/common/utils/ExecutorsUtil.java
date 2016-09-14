package com.txc.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public class ExecutorsUtil<T extends Runnable> {
    public final static ExecutorService executorService = Executors.newCachedThreadPool();
    public ExecutorService  execute(){
       return executorService;
    }
}
