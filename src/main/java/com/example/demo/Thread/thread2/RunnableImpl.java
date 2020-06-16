package com.example.demo.Thread.thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
*
*   lock使用步骤:
*     1.在成员位置创建一个ReentrantLock对象
*     2.在可能出现安全问题的代码前调用Lock接口中得到方法Lock获取锁
*     3.在可能出现安全问题的代码前调用Lock接口中得到方法unLock释放锁
* */
public class RunnableImpl implements Runnable  {


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
