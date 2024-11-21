package com.neo.workshop.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args){

        EmployeService employeService = new EmployeService();

        EmployeService employeService2 = employeService;

        System.out.println(employeService.hashCode());

        System.out.println(employeService2.hashCode());
        Map<Employee,Employee> employeeMap = new HashMap<>();
        Employee  getEmp = null;
        for (int i =0;i<1000000;i++) {
            Employee  gopi = new Employee("Gopi"+i, "NEOO7");
            employeeMap.put(gopi,gopi);
            if (i ==5000){
                getEmp =gopi;
            }
        }
        long startTimeInMills = System.currentTimeMillis();

        System.out.println(employeeMap.get(getEmp));
        long endtTimeInMills = System.currentTimeMillis();

        System.out.println(" Execution Time "+(endtTimeInMills-startTimeInMills));

        Employee nani = new Employee("Nani","NEOO9");

        Employee nani2 = new Employee("Nani","NEOO9");
        System.out.println(nani.hashCode()+"   both object are equal   "+nani2.hashCode());
        Employee nani3 = new Employee("Nani","NEO10");

        String name = new String("NaNi");
        String name2 = new String("Nani");


        System.out.println(name.hashCode()+"    name  "+name2.hashCode());









    }
}
