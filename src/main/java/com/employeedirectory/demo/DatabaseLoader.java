//package com.employeedirectory.demo;
//
//import com.employeedirectory.demo.model.Employee;
//import com.employeedirectory.demo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseLoader implements CommandLineRunner {
//
//    private final EmployeeRepository repository;
//
//    @Autowired
//    public DatabaseLoader(EmployeeRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//        this.repository.save(new Employee("Frodo", "Hoonen", "Engineer", "$55,000"));
//    }
//}