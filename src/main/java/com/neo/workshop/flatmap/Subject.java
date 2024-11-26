package com.neo.workshop.flatmap;

import com.neo.workshop.collectiondemo.EmployeeEntity;

public class Subject implements Comparable<Subject>{

    private String name;

    private Integer marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Subject o) {

        System.out.println(" current value "+this.marks+"  other value "+o.marks);
        int value =  this.marks.compareTo(o.marks);

        System.out.println("  value  "+value);

        return value;
    }
}
