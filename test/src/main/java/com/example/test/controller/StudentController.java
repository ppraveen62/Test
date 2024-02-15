package com.example.test.controller;

import com.example.test.entity.School;
import com.example.test.entity.Student;
import com.example.test.repository.SchoolRepository;
import com.example.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/get")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
