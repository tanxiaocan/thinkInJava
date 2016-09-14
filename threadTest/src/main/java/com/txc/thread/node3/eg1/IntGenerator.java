package com.txc.thread.node3.eg1;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
