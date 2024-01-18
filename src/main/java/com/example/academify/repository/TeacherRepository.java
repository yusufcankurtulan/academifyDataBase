package com.example.academify.repository;

import com.example.academify.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // İhtiyaca özel sorgular buraya eklenebilir
}
