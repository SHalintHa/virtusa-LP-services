package com.shalintha.studentservice.service;

import com.shalintha.studentservice.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student s);

    List<Student> fetchAllStudents();

    Student saveStudent(Student student);

    Optional<Student> fetchStudent(int id);
}
