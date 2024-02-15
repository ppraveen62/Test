package com.example.test.repository;

import com.example.test.entity.StudentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentAssignmentRepository extends JpaRepository<StudentAssignment ,Long> {
    List<StudentAssignment> findByClassesId(Long classesId);
}
