package com.shalintha.studentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.shalintha.studentservice.model.Student;

@Service
public class StudentService {
	
	
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
