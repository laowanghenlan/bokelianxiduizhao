package com.example.demo.Stream.teststream;

import lombok.Data;

@Data
public class Person {

    private String name;

    public Person(){

    }

    public  Person(String name){
        this.name = name;
    }

}
