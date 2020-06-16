package com.example.demo.Thread.thread1;

public class MyThread extends Thread{
//    在Thread类的子类中重写Thread类中的run方法，设置线程任务(开启线程要做什么?)
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" +i);
        }
    }
}
