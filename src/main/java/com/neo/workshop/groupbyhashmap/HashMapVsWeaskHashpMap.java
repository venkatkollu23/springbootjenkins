package com.neo.workshop.groupbyhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashMapVsWeaskHashpMap {

    public static void main(String[] args){
        Map<Employee,String>  employeeStringMap = new HashMap<>();

        Employee e = new Employee();
        e.setEmpId("1");
        e.setSalary(2000);
        e.setDept("IT");

        employeeStringMap.put(e,"HI");

        System.out.println(employeeStringMap);

        e = null;
        System.gc();
        System.out.println(employeeStringMap);

        Map<Employee,String>  weakemployeeStringMap = new WeakHashMap<>();

        Employee e1 = new Employee();
        e1.setEmpId("1");
        e1.setSalary(2000);
        e1.setDept("IT");

        weakemployeeStringMap.put(e1,"HI");

        System.out.println(" Weak hash map "+weakemployeeStringMap);

        e1 = null;
        System.gc();
        System.out.println(" Weak hash map "+weakemployeeStringMap);

String reference= new String("A");
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("A", 1);
        identityHashMap.put(reference, 2);
        System.out.println(identityHashMap.size()); // 2
        System.out.println(identityHashMap.get(reference)); // 1

        System.out.println(identityHashMap.get(new String("A"))); // 1

    }
}
