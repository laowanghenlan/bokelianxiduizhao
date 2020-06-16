package com.example.demo.Stream.concat;

import java.util.stream.Stream;

public class DemoConcat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("撒啊的", "阿斯蒂芬", "asdad", "adad");
        Stream<String> stream2 = Stream.of("撒啊的asca", "阿芬", "a撒旦", "a阿万打完d");
        //把以上两个组合合为一体
        Stream<String> concat = Stream.concat(stream, stream2);
        concat.forEach(name-> System.out.println(name));

    }
}
