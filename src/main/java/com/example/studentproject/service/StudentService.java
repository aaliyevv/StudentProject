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

    public Student create (Student student) {
        return studentRepository.save(student);
    }

    public Student update (Long id, Student student) {
        Student oldStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        oldStudent.setFirstName(student.getFirstName());
        oldStudent.setLastName(student.getLastName());
        return studentRepository.save(oldStudent);
    }

    public void delete (Long id) {
        studentRepository.deleteById(id);
    }

}
