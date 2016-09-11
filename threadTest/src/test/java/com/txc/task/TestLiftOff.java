package com.txc.task;

import org.junit.Test;

/**
 * Created by tanxiaocan on 2016/9/8.
 */
public class TestLiftOff {
    @Test
    public void testLiftOff(){
        Thread thread = new Thread(new LiftOff(11));
        thread.start();
        System.out.println("Waiting for lift off:");
    }
}
