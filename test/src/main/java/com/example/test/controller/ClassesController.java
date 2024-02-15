package com.example.test.controller;

import com.example.test.entity.Classes;
import com.example.test.entity.School;
import com.example.test.entity.StudentAssignment;
import com.example.test.repository.ClassesRepository;
import com.example.test.repository.StudentAssignmentRepository;
import com.example.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assignment")
public class ClassesController {
    @Autowired
    ClassesRepository classesRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentAssignmentRepository studentAssignmentRepository;

    @GetMapping("/getAll")
    public List<Classes> getAll() {
        return classesRepository.findAll();
    }

    @GetMapping("/get")
    public Classes getBYClassId(@RequestParam(value = "classId") Long id) {
        Classes response =  classesRepository.findById(id).get();
        response.setStudents(studentAssignmentRepository.findByClassesId(id));
        return response;
    }

    @PostMapping("/create")
    public Classes create(@RequestBody Classes classes){
        return classesRepository.save(classes);
    }
}
