package com.employeedirectory.demo.service;

import com.employeedirectory.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    List<Employee> retrieveEmployees();

    // public Employee getEmployee(Long employeeId);

    Optional<Employee> getEmployeeId(Long employeeId);

//    public void saveEmployee(Employee employee);
//
//    public void deleteEmployee(Long employeeId);
//
//    public void updateEmployee(Employee employee);
}
