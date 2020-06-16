package com.example.demo.Thread.ThreadIock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
 *解决线程安全问题。
 *   lock使用步骤:
 *     1.在成员位置创建一个ReentrantLock对象
 *     2.在可能出现安全问题的代码前调用Lock接口中得到方法Lock获取锁
 *     3.在可能出现安全问题的代码前调用Lock接口中得到方法unLock释放锁
 * */
public class RunnableImpl1 implements Runnable{
    private int ticket=100;

    Lock I = new ReentrantLock();//1.在成员位置创建一个ReentrantLock对象
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while (true){
            //2.在可能出现安全问题的代码前调用Lock接口中得到方法Lock获取锁
            I.lock();
            //先判断是否存在
            if (ticket>0){
                //阻塞线程，使程序睡眠，提高安全问题出现的概率
                try {
                    Thread.sleep(10);
                    //票存在，开始卖票
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    //3.在可能出现安全问题的代码前调用Lock接口中得到方法unLock释放锁
                    I.unlock();//finally的好处是无论程序是否异常，都会把锁释放掉
                }
            }
        }
    }
}
