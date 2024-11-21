package com.neo.workshop.streamsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemoTest {


    public static void main(String[] args){

        Employee e=  new Employee("NE1","IT");
        System.out.println( e.hashCode());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e);
        employeeList.add(new Employee("NE2","ECE"));
        employeeList.add(new Employee("NE3","IT"));
        employeeList.add(new Employee("NE4","EEE"));


        int startIndex = 0;

        int endIndex = employeeList.size();


        for ( int startI =0;  startI< employeeList.size() ;   startI++){

            System.out.println(   employeeList.get(startI).getId() +"  "+ employeeList.get(startI).hashCode()+"   "+startI);

        }


        employeeList.stream().forEach( mydemoEmp -> {
            System.out.println(   mydemoEmp.getId() +"  "+ mydemoEmp.hashCode());

        });


        Predicate<Employee> deptPredicate = (empPredicate) ->   empPredicate.getDept().equals("IT");



     long itEmpCount =    employeeList.stream().filter(  emp -> deptPredicate.test(emp)).count();

        long itEmpCountInlinePC =    employeeList.stream().filter(  emp ->  emp.getDept().equals("IT")).count();

        long itEmpCountInline =    employeeList.stream().filter(  emp -> deptPredicate.test(emp)).count();

        System.out.println(   itEmpCount);
        int itEmpLegacyCount = 0;
        for ( int startI =0;  startI< employeeList.size() ;   startI++){
              if (deptPredicate.test(employeeList.get(startI))){
                  itEmpLegacyCount = itEmpLegacyCount+1;

              }
              System.out.println(" before adding new employee in for loop ");
          //  employeeList.add(new Employee("NE2","Test"));
        }

        System.out.println(  " itEmpLegacyCount "+ itEmpLegacyCount);

       Iterator<Employee> itr  =  employeeList.iterator();

       for (;itr.hasNext();){

           System.out.println(  " Employee  "+ itr.next());
       }

    }
}
