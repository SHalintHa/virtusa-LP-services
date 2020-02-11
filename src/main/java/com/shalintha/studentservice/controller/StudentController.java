package com.shalintha.studentservice.controller;


import java.util.List;

import com.shalintha.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shalintha.studentservice.model.Student;
import com.shalintha.studentservice.service.StudentServiceImpl;


@RestController
@RequestMapping("/services")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		
		return studentService.getAllStudents();
	}
	
//	@RequestMapping("/student/{id}")
//	public Student getAStudent(@PathVariable int id) {
//		return studentService.getAStudent(id);
//	}

	@RequestMapping(value = "/student")
	public Student saveStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	}
	

}
