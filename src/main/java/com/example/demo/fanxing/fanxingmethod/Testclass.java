package com.example.demo.fanxing.fanxingmethod;

public class Testclass {

    public static void main(String[] args) {
        //创建Method对象
        Method m = new Method();
        /*调用含有泛型的方法
        * 传递什么类型，泛型就是什么类型
        *
        * */
        m.method1(10);
        m.method1("abc");
        m.method1(9.9);
        m.method1(true);

        m.method2("静态方法，不建议创建对象使用");

        //静态方法，通过类名，方法名(参数)可以直接使用
        Method.method2("静态方法");
    }

}
