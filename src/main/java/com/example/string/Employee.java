package com.example.string;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Employee {
    @JsonProperty("firstname")
    private String name;
    @JsonProperty("lastname")
    private String surname;
    private int department;

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
    public Employee (String name, String surname, int department, int salary)
    {
        this.name= name;
        this.surname=surname;
        this.department=department;
        this.salary=salary;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getFullName(){return name + " " +surname;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString () {
        return  " ФИ " + this.getName() + " " + this.getSurname() +" отдел "+ this.getDepartment()+ " ЗП " + this.getSalary();
    }
}
