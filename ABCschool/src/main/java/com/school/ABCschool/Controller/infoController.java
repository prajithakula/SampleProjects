package com.school.ABCschool.Controller;


import com.school.ABCschool.Service.SchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class infoController {
    private final SchoolService service;

    public infoController(SchoolService service) {
        this.service = service;
    }
    @GetMapping("/info")
    public String getSchoolname(){
        return service.getName();
    }
}
