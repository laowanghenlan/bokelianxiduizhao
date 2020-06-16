package com.example.demo.FunctionInterface.Consumer;

import java.util.function.Consumer;
/*
*   练习：
*      字符串数组当中存在多条信息，请按照格式，将信息打印出来。
*      要求将打印信息姓名的动作作为第一个Consumer接口的Lambda实例，
*      将打印性别的动作作为一二个Consumer接口的Lambda实例，
*      将两个Consumer接口按照顺序"拼接"到一起。
*
*
* */
public class TestConsumer {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        //遍历字符串数组
        for (String message : arr) {
            //使用andThen方法链接两个Consumer接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        //定义一个字符串类型的数组
        String[] arr = {"啊发放","反而","二手房","穑夫而非"};

        //调用printInfo方法，传递一个字符串数组，和两个Lambda表达式
        printInfo(arr,(message)->{
            //消费方式：对message进行切割，获取姓名，按照指定的格式输出
            String name = message.split(",")[0];
            System.out.print("姓名:"+name);
        },(message)->{
            //消费方式：对message进行切割，获取年龄，按照指定的格式输出
            String age = message.split(",")[0];
            System.out.println("。年龄:"+age+"。");
        });
    }
}
