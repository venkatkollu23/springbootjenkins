package com.neo.workshop.streamsdemo;

public class Employee {

    private String id;

    private String dept;

    public Employee(String id,String dept){
        this.id =id;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }
}
