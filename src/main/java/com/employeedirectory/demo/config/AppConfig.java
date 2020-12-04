package com.employeedirectory.demo.config;

import com.employeedirectory.demo.model.Employee;
import com.employeedirectory.demo.repository.EmployeeRepository;
import com.employeedirectory.demo.service.EmployeeService;
import com.employeedirectory.demo.service.impl.EmployeeServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class AppConfig {

//    @Bean
//    CommandLineRunner initDatabase(EmployeeRepository repository) {
//        return args -> {
//            repository.save(new Employee("Bilbo ", "Baggins", "burgular", "$0"));
//            repository.save(new Employee("Frodo ", "Baggins", "theif", "$0"));
//        };
//    }

//    @Bean
//    public EmployeeService employeeService() {
//        return new EmployeeServiceImpl();
//    }
}
