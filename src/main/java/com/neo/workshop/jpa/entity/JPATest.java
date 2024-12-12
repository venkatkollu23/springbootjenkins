package com.neo.workshop.jpa.entity;

import java.util.List;

public class JPATest {


    public static void main(String[] args){
        EmployeeService service = new EmployeeService();
      List<ProjectEntity> projectEntityList =   service.nplusone();

        for (int i =0;i<projectEntityList.size();i++){


            System.out.println("  Project  ::::::: " +projectEntityList.get(i));

           projectEntityList.get(i).getEmployeeEntityList().forEach( emp -> {
                System.out.println(" emp "+emp);
            });
        }

      System.out.println(projectEntityList);
    }
}
