package com.txc.thread.node3.eg1;

import com.txc.common.BaseInterface;
import java.util.concurrent.TimeUnit;
import static javafx.scene.input.KeyCode.T;

/**
 * Created by tanxiaocan on 2016/9/14.
 */
public class EvenGenerator extends IntGenerator implements BaseInterface{
    private int currentEvenValue = 0;
    @Override
    public int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    @Override
    public void test() {
        EvenChecker.test(new EvenGenerator(),10);
    }
}
