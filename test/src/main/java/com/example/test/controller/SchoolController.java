package com.example.test.controller;

import com.example.test.entity.School;
import com.example.test.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/get")
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @PostMapping("/create")
    public School create(@RequestBody School school){
        return schoolRepository.save(school);
    }
}

