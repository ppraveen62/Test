package com.example.test.repository;

import com.example.test.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Long> {

    Classes findBySchoolId(String id);
}
