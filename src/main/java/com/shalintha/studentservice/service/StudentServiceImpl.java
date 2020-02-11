package com.shalintha.studentservice.service;

import java.util.List;

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
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

}
