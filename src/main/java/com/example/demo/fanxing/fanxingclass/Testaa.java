package com.example.demo.fanxing.fanxingclass;

public class Testaa {
    public static void main(String[] args) {
        //不写泛型默认为object类型
         aa la = new aa();
         la.setName("阿达阿达");
         Object obj = la.getName();

         //创建aa对象,泛型使用Integer类型
        aa<Integer> la1 = new aa<>();
        la1.setName(1);

        Integer name = la1.getName();
        System.out.println(name);

        //创建aa对象,泛型使用String类型
        aa<String> la2 = new aa();
        la2.setName("老王真帅");

        String name2 = la2.getName();
        System.out.println(name2);

    }
}
