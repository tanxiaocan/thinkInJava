package com.txc.innerClassTest;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class MyInnerClass {
    private String outerClassFiled1;
    private static String staticOuterClassFiled1;
     class Origin{
        private int id;
        private String name;

        public Origin(int id, String name) {
            this.id = id;
            this.name = name;
        }

        String readName(){
            return name;
        }
    }
    class Destination{
        private int id;
        private String name;
        public Destination(int id, String name) {
            this.id = id;
            this.name = name;
        }
        String readName(){
            return name;
        }
    }

    static class StaticInnerClass{
        public void testReadOuterMembers(){
            staticOuterClassFiled1 = "hh";
        }
    }
}
