package com.example.demo.FunctionInterface.Supplier;

import java.util.function.Supplier;

public class TestSupplier {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> su){
        return su.get();
    }

    public static void main(String[] args) {
        int[] arr = {200,22,0,1,45,55,66,74545,213,231312333};
      int mavValue = getMax(()->{
          //定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的最大值
            int max = arr[0];
            //遍历数组，获取数组中的其他元素
            for (int i : arr) {
            //使用其他的元素和最大值比较
                 if (i > max){
                     max = i;
                 }
            }
              return max;

        });

        System.out.println(mavValue);
    }
}
