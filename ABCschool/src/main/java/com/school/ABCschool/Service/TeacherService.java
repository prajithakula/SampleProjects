package com.school.ABCschool.Service;

import org.springframework.stereotype.Service;


public class TeacherService {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public TeacherService(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
