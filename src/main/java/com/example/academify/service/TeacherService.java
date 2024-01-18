package com.example.academify.service;

import com.example.academify.model.Teacher;
import com.example.academify.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }
}
