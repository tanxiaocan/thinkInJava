package com.txc.innerClassTest;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class OtherClass {
    public String useInnerClass(){
        MyInnerClass.Origin origin = new MyInnerClass().new Origin(1,"hunan");
        MyInnerClass.Destination destination = new MyInnerClass().new Destination(2,"beijing");
        return origin.readName() + " to " + destination.readName();
    }
    public static String useInnerClassInStaticMethod(){
        MyInnerClass.Origin origin = new MyInnerClass().new Origin(1,"hunan");
        MyInnerClass.Destination destination = new MyInnerClass().new Destination(2,"beijing");
        return origin.readName() + " to " + destination.readName();
    }
}
