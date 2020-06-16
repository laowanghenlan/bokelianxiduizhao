package com.example.demo.fanxing.fanxinginterface;
/**
 *
 *好友泛型的接口的第二种使用方法: 接口使用什么泛型，类跟着接口走就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型。
 *
 */

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
