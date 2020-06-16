package com.example.demo.ArrayList.ArrayListshuzi1;

import java.util.ArrayList;
import java.util.Random;
/**
 *需求： 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。要求使用自定义的方法实现筛选。
 *
 * 分析：
 * 1.需要创建一个大集合，用来存储int数字
 * 2.用Random产生随机数，nextInt进行循环内调
 * 3.循环20次，把随机数字放入大集合：
 * 4.定义一个方法，用来筛选。
 * 筛选： 根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 一.返回值类型： ArrayList小集合smallList(里面元素个数不确定)
 * 二.方法名称： getsmallList
 * 三.参数列表： ArrayList大集合biglist(装着20随机数字)
 * 5.判断（if）是偶数： num % 2 == 0
 * 如果是偶数，就放到小集合当中，否则不放。
 *
 *
 *
 */

public class ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        //20.fori
        for (int i = 0; i < 20 ; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(biglist);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    //方法的用处: 接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist){
    //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0){
                smallist.add(num);
            }
        }

       return smallist;
    }

}
