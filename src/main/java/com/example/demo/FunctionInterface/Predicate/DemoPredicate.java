package com.example.demo.FunctionInterface.Predicate;

import java.util.function.Predicate;
/*
*   java.util.function.predicate<T>接口
*   作用：对某种数据类型的数据进行判断，结构返回一个boolean值
*
*    Predicate接口中包含一个抽象方法：
*      boolen test():用来对指定数据类型数据进行判断的方法
*      结果：
*          符合条件，返回true
*          不符合条件，返回false
*      
* */
public class DemoPredicate {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "feefef";
       boolean b = checkString(s,(String str)->{
           //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断结构输出
            return str.length()>5;
        });
        System.out.println(b);
    }
}
