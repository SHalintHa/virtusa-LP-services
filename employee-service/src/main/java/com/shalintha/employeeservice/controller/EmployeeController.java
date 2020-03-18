package com.shalintha.employeeservice.controller;

import com.shalintha.employeeservice.model.Employee;
import com.shalintha.employeeservice.model.Telephone;
import com.shalintha.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee findEmpById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        System.out.println("*******************Employee service 2****************************************");
        return employeeService.findAllEmployee();
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Employee saveEmployee(@RequestBody Employee employee) {

        for (Telephone telephone : employee.getTelephones()) {
            telephone.setEmployee(employee);
        }
        return employeeService.saveEmployee(employee);
    }

}
