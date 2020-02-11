package com.shalintha.studentservice.service;

import java.util.List;
import java.util.Optional;

import com.shalintha.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shalintha.studentservice.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student save(Student s){
        Student student = studentRepository.save(s);
        return student;
    }

    @Override
    public List<Student> fetchAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id){
        return studentRepository.findById(id);
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> fetchStudent(int id) {
        return studentRepository.findById(id);
    }
}
