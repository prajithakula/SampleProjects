package com.school.ABCschool.Controller;

import com.school.ABCschool.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
    private final StudentService student;
    public StudentController(StudentService service) {

        this.student = service;
    }
    @GetMapping ("/name")
    public String getName(){
        return student.getName();
    }
    @GetMapping("/age")
    public int getAge()
    {
        return student.getAge();
    }


}