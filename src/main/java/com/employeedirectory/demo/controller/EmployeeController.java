package com.employeedirectory.demo.controller;

import com.employeedirectory.demo.exceptions.EmployeeNotFoundException;
import com.employeedirectory.demo.model.Employee;
import com.employeedirectory.demo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @RequestMapping(value = "/")
//    public String index() {
//        return "index";
//    }
//    @Autowired
//    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;

    EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // get all employees

    @GetMapping("/directory")
    public List<Employee> getDirectory() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @GetMapping("/directory/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
    }

    @PostMapping("/directory/newEmployee")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @PutMapping("/directory/{employeeId}")
    Employee replaceEmployee(@RequestBody Employee currEmployee, @PathVariable Long employeeId) {

        return employeeRepository.findById(employeeId)
                .map(employee -> {
                    employee.setFirstName(currEmployee.getFirstName());
                    employee.setLastName(currEmployee.getLastName());
                    employee.setPosition(currEmployee.getPosition());
                    employee.setSalary(currEmployee.getSalary());
                    return employeeRepository.save(employee);
                })
                .orElseGet(() -> {
                    currEmployee.setId(employeeId);
                    return employeeRepository.save(currEmployee);
                });
    }

    @DeleteMapping("/employees/{employeeId}")
    void deleteEmployee(@PathVariable Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

//    @Autowired
//    private Employee employee;
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping("/directory")
//    @ResponseBody
//    public List<Employee> getDirectory() {
//        List<Employee> list = employee.get
//    }
}

