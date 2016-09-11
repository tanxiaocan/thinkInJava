package com.txc.innerClassTest;

import com.txc.innerClassTest.OtherClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class MyInnerClassTest {
    @Test
    public void testConstructInnerClass(){
        System.out.println(new OtherClass().useInnerClass());
        System.out.println(OtherClass.useInnerClassInStaticMethod());
        Assert.assertNotNull(new OtherClass().useInnerClass());
    }
}
