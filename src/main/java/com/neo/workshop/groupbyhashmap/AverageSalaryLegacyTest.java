package com.neo.workshop.groupbyhashmap;

import com.neo.workshop.collectiondemo.Emp;

import java.util.*;

public class AverageSalaryLegacyTest {

    public static void main(String[] args){
        List<Employee> itEmpList = new ArrayList<>();

        Employee first = new Employee();
        first.setEmpId("1");
        first.setSalary(1000);
        first.setDept("IT");
        Employee second = new Employee();
        second.setEmpId("2");
        second.setSalary(2000);
        second.setDept("IT");
        Employee third = new Employee();
        third.setEmpId("3");
        third.setSalary(2000);
        third.setDept("IT");
        itEmpList.add(first);
        itEmpList.add(second);
        itEmpList.add(third);
        Employee cscfirst = new Employee();
        cscfirst.setEmpId("4");
        cscfirst.setSalary(5000);
        cscfirst.setDept("CSC");
        Employee cscsecond = new Employee();
        cscsecond.setEmpId("5");
        cscsecond.setSalary(1000);
        cscsecond.setDept("CSC");
        Employee cscthird = new Employee();
        cscthird.setEmpId("6");
        cscthird.setSalary(1000);
        cscthird.setDept("CSC");
        itEmpList.add(cscfirst);
        itEmpList.add(cscsecond);
        itEmpList.add(cscthird);


        Map<String,Double> deptAvgSalaryMap = new HashMap<>();
        Map<String,Integer> deptEmpCountMap = new HashMap<>();

       Iterator<Employee> employeeIterator = itEmpList.iterator();

       while (employeeIterator.hasNext()){
           Employee emp = employeeIterator.next();
           if (deptAvgSalaryMap.containsKey(emp.getDept())){
               Double d = deptAvgSalaryMap.get(emp.getDept());
               Double total = d+emp.getSalary();
               deptAvgSalaryMap.put(emp.getDept(),total);
             int count=   deptEmpCountMap.get(emp.getDept());
             int totalCount = count+1;
               deptEmpCountMap.put(emp.getDept(),totalCount);
           }else {
               deptAvgSalaryMap.put(emp.getDept(),emp.getSalary());
               deptEmpCountMap.put(emp.getDept(),1);
           }
       }

System.out.println("total salary "+deptAvgSalaryMap);

        System.out.println("total count "+deptEmpCountMap);

        Iterator<String> deptIterator =  deptAvgSalaryMap.keySet().iterator();

        while(deptIterator.hasNext()){
            String dept = deptIterator.next();

          Double totalSalary =   deptAvgSalaryMap.get(dept);
         int totalCount  =    deptEmpCountMap.get(dept);

         System.out.println(" Avg salary by dept" +totalSalary/totalCount);
        }










    }
}
