package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String schoolId;
    @OneToMany(mappedBy = "classes", cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<StudentAssignment> students;
    private String status;
}
