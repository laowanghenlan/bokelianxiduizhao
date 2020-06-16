package com.example.demo.Stream.forEach;

import java.util.stream.Stream;

/*
* stream流中的常用方法forEach
*
* void forEach(Consumer<？ super T> action);
* 该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
* Consumer接口是一个消费形的函数式接口，可以传递Lambda表达式，消费数据
*
* 作用:
*   forEach方法，用来遍历流中的数据
*   是一个终结方法，遍历之后就不能继续调用stream流中的方法
*
* */
public class demoforEach {
    public static void main(String[] args) {
        //获取一个stream流
        Stream<String> of = Stream.of("是否","十分舒服","水费水电费");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        of.forEach((String name)->{
            System.out.println(name);
        });

//        of.forEach(name-> System.out.println(name));      优化后的语句
    }

}
