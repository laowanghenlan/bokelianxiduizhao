package com.example.demo.ArrayList;

import java.util.ArrayList;
import java.util.Random;
/*需求： 生成6个1-33之间的随机整数，添加到集合，并遍历集合。

思路：
1.需要存储6个数字，创建一个整形集合，
2.产生随机数，需要用到Random
3.用for循环六次
4.用r.nextInt(int n)，循环内调，参数是33，0-32，整体+1才是1-33
5.吧数字添加到集合中，add
6.list.fori遍历集合
*/

public class ArrayListSuijishu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
