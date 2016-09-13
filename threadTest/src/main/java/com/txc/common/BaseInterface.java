package com.txc.common;

import com.txc.thread.concurrent.ExceptionThread;

/**
 * Created by xiaocantan on 2016/9/12.
 */
public interface BaseInterface {
    void test();
    class TestTemplate{
        public static void main(String[] args){
            BaseInterface baseInterface = new ExceptionThread();
            baseInterface.test();
        }
    }
}
