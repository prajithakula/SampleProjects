package com.school.ABCschool.Controller;

import com.school.ABCschool.Service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }
    @GetMapping("/name")
    public String getName()
    {
        return service.getName();
    }
    @GetMapping("/age")
    public  int getage(){
        return service.getAge();
    }

}
