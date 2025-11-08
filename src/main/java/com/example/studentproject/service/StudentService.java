package com.example.studentproject.service;

import com.example.studentproject.model.Student;
import com.example.studentproject.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("id not found"));
    }





}
