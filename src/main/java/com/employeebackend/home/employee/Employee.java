package com.employeebackend.home.employee;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String position;
    private Number salary;

    public Employee(long id, String firstName, String lastNme, String position, Number salary) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastNme;
        this.position = position;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public Number getSalary() {
        return salary;
    }
}
