package com.school.ABCschool.Service;

public class SchoolService {
    private String  name;

    public SchoolService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
