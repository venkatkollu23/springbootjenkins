package com.neo.workshop.insertjdbc;

import java.sql.*;
import java.util.List;

public class JDBCParentChildInsertService {



    public int getMaxId(String query){

        int max = 0;
        Connection con;
        PreparedStatement psmt;
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =    DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","sonar");
            psmt =  con.prepareStatement(query);
            resultSet=  psmt.executeQuery();
            if (resultSet != null && resultSet.next()){
                max = resultSet.getInt(1)+1;
            }else {
                max =1;
            }
        }catch (Exception e){

        }

        return max;
    }


    public void insertEmp(Employee employee){
        Connection con;
        PreparedStatement psmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =    DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","sonar");
            psmt =  con.prepareStatement("insert into sonar.employee_latest(eid,name,dept,state,salary,pid) " +
                    "values(?,?,?,?,?,?)");

            psmt.setInt(1,employee.getId());
            psmt.setString(2,employee.getName());
            psmt.setString(3,employee.getDept());
            psmt.setString(4,employee.getState());

            psmt.setDouble(5,employee.getSalary());
            psmt.setInt(6,employee.getPid());

            boolean status =  psmt.execute();
            if (status){
                System.out.println("Insert is successful....");
            }else {
                System.out.println("Insert failed....");
            }

        }catch (Exception e){

        }

    }

    public void insertProject(Project proj){
        Connection con;
        PreparedStatement psmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =    DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","sonar");
            psmt =  con.prepareStatement("insert into sonar.project_latest(id,pname,startdate,enddate) " +
                    "values(?,?,?,?)");
            psmt.setInt(1,proj.getId());
            psmt.setString(2,proj.getName());
            psmt.setDate(3,new Date(proj.getStartDate().getTime()));
            psmt.setDate(4,new Date(proj.getEndDate().getTime()));
            boolean status =  psmt.execute();
            if (status){
                System.out.println("Insert Project is successful....");
            }else {
                System.out.println("Insert Project is  failed....");
            }

        }catch (Exception e){

        }
    }

    public void saveProjectEmp(List<Project> projects){
        // Iterate project
        for (int i =0;i<projects.size();i++){

            Project project = projects.get(i);

            // getmax pid from I need pass query
           int maxIdOfProjectId =  getMaxId("select max(id) from sonar.project_latest");

            project.setId(maxIdOfProjectId);
            //  insert project into table
            insertProject(project);



            project.getEmployeeList().forEach( emp -> {
                // get max of employee
                int maxIdOfEmpId =  getMaxId("select max(id) from sonar.employee_latest");
                emp.setId(maxIdOfEmpId);
                emp.setPid(project.getId());

                // insert employee
                insertEmp(emp);
            });


        }










    }
}
