package com.example.demo.FunctionInterface.Supplier;

import java.util.function.Supplier;

/*
*
*     常用的函数式接口  java.util.function.Supplier<T>
      该接口仅包含一个无参的方法: T get()。 用来获取一个泛型参数指定类型的对象数据

      * Supplier<T>接口被称之为生产形接口，指定接口的泛型是什么类型，接口中的get方法就会生产什么类型的数据
*
* */
public class DemoSupplier {
    //定义一个方法，方法的参数传递Supplier<接口>，泛型执行String.get方法就会返回一个String
    public static String getString(Supplier<String> su){
        return su.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            //生产一个字符串，并返回
            return "楼德华";
        });
        System.out.println(s);

        //Lambda表达式优化后
        String s2 = getString(()->"楼德华");
        System.out.println(s2);
    }

}
