package com.example.demo.FunctionInterface.Predicate;

import java.util.function.Predicate;

/*
*    需求：判断一个字符串，有两个判断条件
*       1.判断字符串的长度是否大于5
*       2.判断字符串中是否包含a
*    满足一个条件即可，我们就可以使用//运算符连接两个条件
*
*    Predicate接口中有一个方法or，表示或者关系，也可以用于连接两个判断条件
*    defoult Precicate<T> or(Predicate<? supper T> other){
*            Objects.requireNonNull(other);
*            return (t) -> test(t) || other.test(t);
*            }
*
*     方法内部的两个判断条件，也是使用||运算符连接的
*
*    Predicate接口中有一个方法negate,也表示取反的意思
*    default Predicate<T> negate(){
*
*        return (t) -> !test(t);
*     }
*
* */
public class Or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);//等价于return pre1.test(s) // pre2.test(s);

    }



    public static boolean check(String s,Predicate<String> pre){
        return pre.negate().test(s); //相当于 return !pre.test(s);
    }

    public static void main(String[] aregs){
       String s = "adsadd";

        boolean b = check(s,(String str)->{
            //判断字符串的长度是否大于5，并返回结果
            return str.length()>5;
        });

    }

}
