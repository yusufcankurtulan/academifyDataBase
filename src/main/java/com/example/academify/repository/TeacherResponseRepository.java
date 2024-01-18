package com.example.academify.repository;

import com.example.academify.model.TeacherResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherResponseRepository extends JpaRepository<TeacherResponse, Long> {
    List<TeacherResponse> findByTeacherId(Long teacherId);
}
