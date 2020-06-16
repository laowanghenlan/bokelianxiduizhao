package com.example.demo.fanxing.fanxingmethod;

public class Method {
    //定义一个含有泛型的方法
    public <M> void method1(M m){
        System.out.println(m);
    }
    //定义一个含有泛型的静态方法
    public static <S> void method2(S s){
        System.out.println(s);
    }
}
