package com.example.studentproject.service;

import com.example.studentproject.repository.StudentRepository;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }





}
