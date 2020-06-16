package com.example.demo.Stream.skip;

import java.util.stream.Stream;

/*
*  Stream流中的常用方法 skip:用于跳过元素
*  如果希望跳过前几个元素，可以使用skip方法获得一个截取之后的新流;
*  Stream<T> skip(long n);
*   如果流的当前长度大于n，则跳过前n个，否则将会得到一个长度为0的空流。
*
* */
public class DemoSkip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("撒啊的", "阿斯蒂芬", "asdad", "adad");
        //使用skip方法跳过前3个元素
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));
    }
}
