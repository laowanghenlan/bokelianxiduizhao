package com.example.demo.ArrayList.ArrayListStudent;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;


    public Student() {

    }
    public Student(String name,int age) {
    this.name = name;
    this.age = age;
    }

}
