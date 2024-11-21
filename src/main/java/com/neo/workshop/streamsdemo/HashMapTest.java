package com.neo.workshop.streamsdemo;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args){
        Employee e=  new Employee("NE1","IT");
        Employee e1=   new Employee("NE2","ECE");
        Employee e2=new Employee("NE3","IT");
        Employee e3= new Employee("NE4","EEE");
        Map<String,Employee> employeeMap = new HashMap<>();

        employeeMap.put(e.getId(),e);
        employeeMap.put(e1.getId(),e1);
        employeeMap.put(e2.getId(),e2);
        employeeMap.put(e3.getId(),e3);


        Set<Map.Entry<String,Employee>> entrySet=  employeeMap.entrySet();
        Iterator<Map.Entry<String,Employee>> itr = entrySet.iterator();
        for (;itr.hasNext();){
         Map.Entry<String,Employee> entry =    itr.next();
         System.out.println("  iterator key  "+entry.getKey()+"    value "+entry.getValue());
        }


        employeeMap.entrySet().stream().forEach( entry -> {
            System.out.println("  stream key  "+entry.getKey()+"    value "+entry.getValue());
        });

    }
}
