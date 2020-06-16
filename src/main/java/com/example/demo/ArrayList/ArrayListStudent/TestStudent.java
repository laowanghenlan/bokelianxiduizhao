package com.example.demo.ArrayList.ArrayListStudent;

import java.util.ArrayList;
/*要求： 自定义4个student对像，添加到集合，并遍历。
*
*
*
* */
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student a = new Student("狗屎",11);
        Student b = new Student("阿法",12);
        Student c = new Student("色粉",13);
        Student d = new Student("色纺",14);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名: " + stu.getName() + ",年龄" + stu.getAge());
        }
    }
}
