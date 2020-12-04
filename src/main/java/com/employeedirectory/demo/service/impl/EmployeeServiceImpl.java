package com.employeedirectory.demo.service.impl;

import com.employeedirectory.demo.model.Employee;
import com.employeedirectory.demo.repository.EmployeeRepository;
import com.employeedirectory.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> retrieveEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeId(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }
}
