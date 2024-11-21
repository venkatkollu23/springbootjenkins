package com.neo.workshop.collectiondemo;

import java.util.Objects;

public class Employee {


    private String name;

    private String empId;

    public Employee(String name,String empId){
        this.name = name;
        this.empId = empId;
    }


    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name) && Objects.equals(empId, employee.empId);
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
