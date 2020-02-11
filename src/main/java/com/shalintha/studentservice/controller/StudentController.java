package com.shalintha.studentservice.controller;


import java.util.List;
import java.util.Optional;

import com.shalintha.studentservice.model.Telephone;
import com.shalintha.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shalintha.studentservice.model.Student;


@RestController
@RequestMapping("/services")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> fetchAllStudents(){
		
		return studentService.fetchAllStudents();
	}
	
	@RequestMapping("/student/{id}")
	public Optional<Student> fetchStudent(@PathVariable int id) {
		return studentService.fetchStudent(id);
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student){

		for (Telephone telephone: student.getTelephones()) {
			telephone.setStudent(student);
		}
		return studentService.saveStudent(student);
	}
	

}
