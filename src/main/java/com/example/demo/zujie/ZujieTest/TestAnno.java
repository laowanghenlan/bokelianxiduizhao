package com.example.demo.zujie.ZujieTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnno {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class als = c.getClass();
        //3.获取所有方法
        Method[] methods = als.getMethods();

        //出现异常的次数
        int number = 0;
        BufferedWriter bu = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            //判断方法上是否有MyAnno2注解
            if (method.isAnnotationPresent(MyAnno2.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                      //捕获异常，记录到文件中
                    number ++;

                    bu.write(method.getName()+ "方法出异常了");
                    bu.newLine();
                    bu.write("异常名称:" + e.getCause().getClass().getSimpleName());
                    bu.newLine();
                    bu.write("异常原因:"+e.getCause().getMessage());
                    bu.newLine();
                    bu.write("===========================");
                    bu.newLine();
                }
            }
        }
        bu.write("本次测试一共出现"+number+"异常");

        bu.flush();
        bu.close();
    }
}