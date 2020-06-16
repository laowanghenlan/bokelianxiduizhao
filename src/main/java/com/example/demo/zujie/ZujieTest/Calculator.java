package com.example.demo.zujie.ZujieTest;

public class Calculator {
    //加法
    @MyAnno2
    public void add(){
        System.out.println("1 + 0 =" + (1 + 0));
    }
    //减法
    @MyAnno2
    public void sub(){
        System.out.println("1 - 0 =" + (1 - 0));
    }
    //乘法
    @MyAnno2
    public void mul(){
        System.out.println("1 * 0 =" + (1 * 0));
    }
   //除法
    @MyAnno2
    public void div(){
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show(){
        System.out.println("没有BUG");
    }
}

