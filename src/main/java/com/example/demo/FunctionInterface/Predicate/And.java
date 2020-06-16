package com.example.demo.FunctionInterface.Predicate;

import java.util.function.Predicate;

public class And {
    /*
    *  逻辑表达式：可以连接多个判断的条件
    *  &&：与运算符，有false则false
    *  ||:或运算符，有true则true
    *  !:非(取反)运算符，飞真则假，非假则真
    *
    *  需求：判断一个字符串，有两个判断的条件
    *    1.判断字符串的长度是否大于5
    *    2.判断字符串中是否包含a
    *   两个条件必须同时满足，我们酒可以使用&&运算符连接两个条件
    *
    *   Preaicate接口中有一个and，表示并且关系，也可以用于连接两个判断条件
    *   default Predicate<T> and(Predicate<? super T> other){
    *        Objects.requireNonNull(other);
    *        retutn (t) -> this.test(t) && other.test(t);
    * }
    *        方法内部的两个判断条件，也是使用&&运算符链接起来的
    *
    * */
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(s);  //等价于 pre1.test(s) && pre2.test(s);

    }

    public static void main(String[] args) {
        String s = "sadfdff";
        boolean b = checkString(s,(String str)->{
            return str.length()>5;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
