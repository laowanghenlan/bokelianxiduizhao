package com.example.demo.Stream.getStream;

import java.util.*;
import java.util.stream.Stream;

public class DemoGetStream {
    public static void main(String[] args) {
        //１．把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        //获取键，存储到一个set集合中
        Set<String> setkey = map.keySet();
        Stream<String> stream3 = setkey.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对(键与值的映射关系entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> streamS = entries.stream();

        //2.把数组转换为Stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> arr1 = Stream.of(arr);

        String[] arr2 = {"a","bbbbb","rrrrrr","sdsdsdsd"};
        Stream<String> arr21 = Stream.of(arr2);

    }
}
