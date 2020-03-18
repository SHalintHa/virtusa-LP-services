package com.shalintha.employeeservice.service;

import com.shalintha.employeeservice.model.Employee;
import com.shalintha.employeeservice.repository.EmployeeRepository;
import com.shalintha.employeeservice.shared_model.Allocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    HttpHeaders httpHeaders = new HttpHeaders();
    HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);



    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            Employee emp = employee.get();
            ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange(
                    "http://localhost:8181/employee/" + id,
                    HttpMethod.GET, httpEntity, Allocation[].class
            );
            return emp;
        }
        return null;
    }
}
