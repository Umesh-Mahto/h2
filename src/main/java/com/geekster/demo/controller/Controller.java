package com.geekster.demo.controller;

import com.geekster.demo.repository.IStudentRepo;
import com.geekster.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    IStudentRepo iStudentRepo;
     @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
         iStudentRepo.save(student);
         return "added Student details";
     }
     @GetMapping("/getStudent")
    public List<Student>getStudent(){
         return iStudentRepo.findAll();
     }
}
