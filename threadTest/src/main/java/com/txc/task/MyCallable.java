package com.txc.task;

import java.util.concurrent.Callable;
import static javafx.scene.input.KeyCode.T;

/**
 * Created by tanxiaocan on 2016/9/9.
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("callThread" + i);
            Thread.yield();
        }
        return "hello,I'm callAble return!";
    }
}
