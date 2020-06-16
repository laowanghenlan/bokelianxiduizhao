package com.example.demo.Thread.thread2;

public class LambdaThread {

    public static void main(String[] args) {
         //使用匿名内部类的方式，实现多线程
        new Thread(new RunnableImpl()){
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }

            }
        }.start();
//        使用Lambda表达式，实现多线程，简化代码，减少代码的冗余(优化)
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
         System.out.println(Thread.currentThread().getName()+"-->"+i);
       }
        }).start();
    }
}
