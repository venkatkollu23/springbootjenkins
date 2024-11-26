package com.neo.workshop.groupbyhashmap;

public class CloneTest {

    public static void main(String[] args){
        Employee first = new Employee();
        first.setEmpId("1");
        first.setSalary(1000);
        first.setDept("IT");

        Employee second = first;

        System.out.println("first "+first);

        System.out.println("second "+second);

        first.setSalary(5000);

        System.out.println("first "+first);

        System.out.println("second "+second);


        Employee firstdeepClone = new Employee();
        firstdeepClone.setEmpId("1");
        firstdeepClone.setSalary(10000);
        firstdeepClone.setDept("IT");

        Employee seconddeepClone = new Employee();
        seconddeepClone.setSalary(firstdeepClone.getSalary());
        seconddeepClone.setDept(firstdeepClone.getDept());
        seconddeepClone.setEmpId(firstdeepClone.getEmpId());

        System.out.println("firstdeepClone "+firstdeepClone);

        System.out.println("seconddeepClone "+seconddeepClone);

        firstdeepClone.setSalary(50000);

        System.out.println("firstdeepClone "+firstdeepClone);

        System.out.println("seconddeepClone "+seconddeepClone);
    }
}
