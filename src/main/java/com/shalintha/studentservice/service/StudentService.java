package com.shalintha.studentservice.service;

import com.shalintha.studentservice.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student s);

    List<Student> getAllStudents();


    Student saveStudent(Student student);
}
