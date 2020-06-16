package com.example.demo.Thread.WaitAndNotify;
/*
*  等待唤醒案例:线程之间的通信
*    创建一个顾客线程(消费者):告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态(无限等待)
*    创建一个老板线程(生产者):花了五秒做包子，做好包子之后，调用noyify方法，通知顾客吃包子
*
*
*   注意:
*       顾客和老板县城必须使用同步代码块包裹起来，保证带待和唤醒只能有一个在执行
*       同步使用的锁对象必须保证唯一
*       只有锁对象才能调用wait和notify方法(且是同一个锁对象)
*
*     Object类中的方法
*     void wait()
*          在其他线程调用此对象的 notify()方法或 notifyAll()方法前，导致当前线程等待
*     void notify()
*          唤醒在此时对象监视器上等待的单个线程。
*          会继续执行wait方法之后的代码
*
* */
public class DemoWantAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object bj = new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要用到同步代码块技术
                System.out.println("告知老板要的包子的种类和数量");
                synchronized (bj) {
                    try {
                        bj.wait();//调用wait方法，放弃cpu的执行，进入到WAITING无限等待状态   wait和sleep类似，也可以传毫秒值
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    try {
                        Thread.sleep(6000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了，开吃");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                //花五秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒的线程只能有一个执行，需要用到同步代码块技术
                synchronized (bj) {
                    System.out.println("老板五秒钟之后做好包子，告知顾客，可以吃了");
                    //调用notify方法唤醒顾客吃包子
                    bj.notify();//随机唤醒一个等待的线程。
                    //notifyAll();  唤醒所有等待的线程。
                }
            }
        }.start();
    }
}
