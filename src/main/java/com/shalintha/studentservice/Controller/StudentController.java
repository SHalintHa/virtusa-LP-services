package com.shalintha.studentservice.Controller;

import com.shalintha.studentservice.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return Student.getAllStudents();
    }

    @RequestMapping(value = "/student/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getAStudent(@PathVariable("id") int id){

    	Student student = null;
        for(Student s : Student.getAllStudents()){
            if(s.getSid() == id)
                 student = s;
        }
        return student;
    }
}
