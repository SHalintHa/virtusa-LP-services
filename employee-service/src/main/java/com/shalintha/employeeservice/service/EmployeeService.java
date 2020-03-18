package com.shalintha.employeeservice.service;

import com.shalintha.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(int id);
}
