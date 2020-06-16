package com.example.demo.Thread.ThreadIock;
/*
* 模拟卖票案例
* 创建3个线程，同时开启，对共享的票进行出售
* */
public class DemoThreadlock {
    public static void main(String[] args) {
        RunnableImpl1 run = new RunnableImpl1();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
