package com.shalintha.studentservice.service;

import java.util.List;
import java.util.Optional;

import com.shalintha.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shalintha.studentservice.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    
    @Bean
    RestTemplate getRestTemplate() {
    	return new RestTemplate();
    }
    
    @Autowired
    RestTemplate restTemplate;
    
    HttpHeaders httpHeaders = new HttpHeaders();
    HttpEntity<String> httpEntity = new HttpEntity<>("", httpHeaders);


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
    	
//    	Optional<Student> optional = studentRepository.findById(id);
//    	if(optional.isPresent()) {
//    		Student student = optional.get();
//    		ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange("http://localhost:8181/service/allocation/fetch/student/{id}", method, requestEntity, responseType)
//    	}
    	
        return studentRepository.findById(id);
    }
    
    
}
