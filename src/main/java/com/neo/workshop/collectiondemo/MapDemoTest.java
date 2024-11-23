package com.neo.workshop.collectiondemo;

import java.util.*;

public class MapDemoTest {

    public static  void main(String[] args){

        Map<String,Integer> myMarksMap = new HashMap<>();
        // Insert data into Map

        myMarksMap.put("Maths",75);
        myMarksMap.put("English",36);
        myMarksMap.put("Hindhi",37);
        myMarksMap.put("Socail",40);




        // Retrieve data from Map

        Set<Map.Entry<String,Integer>> entrySet = myMarksMap.entrySet();
      Iterator<Map.Entry<String,Integer>> itr =   entrySet.iterator();



      while (itr.hasNext()){
       Map.Entry<String,Integer> entryMap =    itr.next();

       System.out.println(entryMap.getKey()+"  value "+entryMap.getValue());
      }


      myMarksMap.entrySet().stream().forEach( entry -> {
          System.out.println(entry.getKey()+"  value "+entry.getValue());
      });


        Map<String,Integer> myMarksSortedMap = new TreeMap<>();
        // Insert data into Map

        myMarksSortedMap.put("Maths",75);
        myMarksSortedMap.put("English",36);
        myMarksSortedMap.put("Hindhi",37);
        myMarksSortedMap.put("Socail",40);

        myMarksSortedMap.entrySet().stream().forEach( entry -> {
            System.out.println(entry.getKey()+"  value "+entry.getValue());
        });


        Map<EmployeeEntity, EmployeeEntity> myEmployeMap = new TreeMap<>();
        // Insert data into Map
        EmployeeEntity rakeshEmp = new EmployeeEntity("Rakesh","NEO3",true);
        rakeshEmp.setSalary(30000.0);
        rakeshEmp.setAadhar("1");

        EmployeeEntity vijayEmp = new EmployeeEntity("Vijay","NEO1",true);
        vijayEmp.setAadhar("2");
        vijayEmp.setSalary(40000.0);

        EmployeeEntity arunEmp = new EmployeeEntity("Arun","NEO2",true);
        EmployeeEntity arun1Emp = new EmployeeEntity("Arun","NEO2",true);
        arunEmp.setAadhar("3");
        arunEmp.setSalary(30000.0);

        EmployeeEntity nehal = new EmployeeEntity("Nehal","NEO4",false);
        nehal.setSalary(10000.0);
        nehal.setAadhar("4");
        System.out.println(rakeshEmp.hashCode());
        System.out.println(vijayEmp.hashCode());
        System.out.println(arunEmp.hashCode());
        System.out.println(arun1Emp.hashCode());


        myEmployeMap.put(rakeshEmp,rakeshEmp);
        myEmployeMap.put(vijayEmp,vijayEmp);
        myEmployeMap.put(arun1Emp,arun1Emp);
        myEmployeMap.put(arunEmp,arunEmp);
        myEmployeMap.put(nehal,nehal);


      long empCount =   myEmployeMap.entrySet().stream().count();

System.out.println(empCount);

        long activeEmpCount =   myEmployeMap.entrySet().stream()
                .filter( mapEntry -> {
          return   mapEntry.getValue().isStatus();
        }).count();
        System.out.println(activeEmpCount);
                // filter

                // map

        List<Emp> empListForPayroll =   myEmployeMap.entrySet().stream()
                .filter( mapEntry -> {
                    return   mapEntry.getValue().isStatus();
                }).map( myEntry -> {


                });
        System.out.println(activeEmpCount);

                // flatMap

                // reduce







    }
}
