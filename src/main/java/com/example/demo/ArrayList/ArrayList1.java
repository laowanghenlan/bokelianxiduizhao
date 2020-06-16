package com.example.demo.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("刘德华");
        aa.add("周星驰");
        aa.add("周润发");

        //aa.fori    (快捷键)
        //遍历集合

        for (int i = 0; i < aa.size(); i++) {
            //sout    (快捷键)
            System.out.println(aa.get(i));
        }
    }
}
