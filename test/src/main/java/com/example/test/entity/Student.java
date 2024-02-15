package com.example.test.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Student {
    @Id
    private String id;
    private String rollno;
    private String lastname;
    private String middlename;
    private String firstname;
    private LocalDate dateOfJoining;
}

