package com.example.demo.Thread.threadpool;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程正在执行");
    }
}
