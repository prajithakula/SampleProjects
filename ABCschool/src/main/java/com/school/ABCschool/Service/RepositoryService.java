package com.school.ABCschool.Service;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RepositoryService {
    @Bean
    public StudentService getStudentDetails()
    {
        return new StudentService("Prajitha",26);
    }
    @Bean
    public TeacherService getTeacherDetails()
    {
        return new TeacherService("Jeevan",35);
    }
    @Bean
    public SchoolService getSchoolName()
    {
        return new SchoolService("ABC School");
    }
}
