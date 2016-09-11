package com.txc.task;

/**
 * Created by tanxiaocan on 2016/9/8.
 */
public class LiftOff implements Runnable{
    private int countDown = 10;//default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "lift" + id + ":" + (countDown>0?countDown + " ":"lift off");
    }
    public void run() {
        while (countDown-- >0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String[] args){
        int liftHigh = 10;
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new LiftOff(liftHigh));
            thread.start();
        }
        System.out.println("Waiting for lift off");
        Thread.yield();
        System.out.println("总线程数：" + taskCount);
    }
}
