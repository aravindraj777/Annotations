package com.springannotations.in.annotations.controller;

import com.springannotations.in.annotations.beans.StudentDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stdapi")
public class StudenController {

    private List<StudentDetails> studentList;

    @PostConstruct
    public void loadData(){
        studentList  = new ArrayList<>();
        studentList.add(new StudentDetails("Aravind","Raj"));
        studentList.add(new StudentDetails("Shyam","Krishnan"));
    }

    @GetMapping("/studentslist")
    public List<StudentDetails> getStudentList(){
        return studentList;
    }

    @GetMapping("/studentslist/{studentId}")
    public StudentDetails getStudentDetails(@PathVariable int studentId){
        return studentList.get(studentId);
    }

}
