package com.example.demo.Stream.filter;

import java.util.stream.Stream;

/*
*Stream流中的常用方法filter用于对Stream流中的数据进行  过滤
* Stream<T> filter(predicate<? super T> predicate);
* filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式,对数据进行过滤
* Preaicate中的抽象方法
*     boolean test(T t);
*
*
*
* */
public class Demofilter {
    public static void main(String[] args) {
        //创建一个stream流
        Stream<String> stream = Stream.of("王发","王水电费","刘是否","刘发","田防辐");
        //对Stream流中的元素进行过滤，只要性王的人
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("王"); });
        //遍历stream1流
        stream2.forEach(name-> System.out.println(name));

        /*
        *   Stream流属于管道流，只能被消费或使用一次
        *   第一个Stream流调用完毕方法，数据就会流传到下一个stream上       *
        *   而此时第一个Stream流已经使用完毕，就会关闭了
        *   所以第一个Stream流就不能再调用方法了
        * */
    }
}
