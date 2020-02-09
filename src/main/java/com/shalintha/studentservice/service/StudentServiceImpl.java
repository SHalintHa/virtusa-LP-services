package com.shalintha.studentservice.service;

import java.util.List;

import com.shalintha.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shalintha.studentservice.model.Student;

@Service
public class StudentServiceImpl{

    StudentRepository studentRepository;

    public Student save(Student s){
        Student student = studentRepository.save(s);
        return student;
    }

    public static List<Student> getAllStudents(){
        return Student.getAllStudents();
    }

    public static Student getAStudent(int id){

        Student student = null;
        for(Student s : Student.getAllStudents()){
            if(s.getSid() == id)
                student = s;
        }
        return student;
    }

}
