package com.txc.common;

import com.txc.thread.concurrent.ExceptionThread;
import com.txc.thread.node3.eg1.EvenGenerator;
import com.txc.thread.node3.eg1.LockEvenGenerator;
import com.txc.thread.node3.eg1.SynchronizedEvenGenerator;

/**
 * Created by xiaocantan on 2016/9/12.
 */
public interface BaseInterface {
    void test();
    class TestTemplate{
        public static void main(String[] args){
//            BaseInterface baseInterface = new ExceptionThread();
//            baseInterface.test();
//            BaseInterface baseInterface = new EvenGenerator();
//            baseInterface.test();
//            BaseInterface baseInterface = new SynchronizedEvenGenerator();
//            baseInterface.test();
            BaseInterface baseInterface = new LockEvenGenerator();
            baseInterface.test();
        }
    }
}
