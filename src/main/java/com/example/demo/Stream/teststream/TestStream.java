package com.example.demo.Stream.teststream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
*  练习:集合元素处理(Stream流处理方式)
*
* */
public class TestStream {
    public static void main(String[] args) {
        //第一只队伍
        ArrayList<String> list = new ArrayList<>();
        list.add("王五是");
        list.add("赵六");
        list.add("田林奥");
        list.add("林飞");
        list.add("石开洼");
        //1、第一个队伍只要名字为3个字的成员姓名，存储到一个新集合中。
        //2、第一个队伍筛选之后只要前三个人，存储到一个新集合中。
        Stream<String> stream = list.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("撒旦法舒服");
        list1.add("粉色粉哥哥");
        list1.add("粉色粉方十分");
        list1.add("阿法");
        list1.add("粉色粉");

        //3.第二个队伍只要姓粉的成员姓名，存储到一个新集合中。
        //4.第二个队伍筛选之后不要前两个人，存储到一个新集合中。
        Stream<String> stream1 = list1.stream().filter(name -> name.startsWith("粉")).skip(2);

        //5.将两个队伍合并为一个队伍，存储到一个新集合中。
        //6.根据姓名创建Person对象，存储到一个新集合中。
        //7.打印整个队伍的Person对象信息。
        Stream.concat(stream,stream1).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
