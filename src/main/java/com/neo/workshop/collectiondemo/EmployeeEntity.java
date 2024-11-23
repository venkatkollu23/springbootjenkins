package com.neo.workshop.collectiondemo;

import java.util.Objects;

public class EmployeeEntity implements Comparable<EmployeeEntity>{


    private String name;

    private String empId;

    private  boolean status;

    private double salary;
    private String aadhar;



    public EmployeeEntity(String name, String empId, boolean status){
        this.name = name;
        this.empId = empId;
        this.status =status;
    }


    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }


    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }


    @Override
    public int compareTo(EmployeeEntity o) {

        System.out.println(" current value "+this.empId+"  other value "+o.empId);
        int value =  this.empId.compareTo(o.empId);

        System.out.println("  value  "+value);

        return value;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    @Override
    public int hashCode(){
        return  Objects.hash(this.empId,this.name);
    }
}
