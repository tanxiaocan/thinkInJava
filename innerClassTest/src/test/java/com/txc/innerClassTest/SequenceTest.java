package com.txc.innerClassTest;

import com.txc.innerClassTest.privilege.Selector;
import com.txc.innerClassTest.privilege.Sequence;
import org.junit.Test;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class SequenceTest {
    @Test
    public void testSelector(){
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add("txc" + i);
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
