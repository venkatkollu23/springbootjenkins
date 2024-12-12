package com.neo.workshop.jdbc;

import java.sql.*;
import java.util.*;

public class JDBCConnection {

    public static  void preparedStatement(String id) throws  Exception{


             Class.forName("com.mysql.cj.jdbc.Driver");


             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "sonar");


             PreparedStatement stmt = con.prepareStatement("select * from sonar.Employee where id = ?");
                                                              
                     stmt.setString(1,id);

             ResultSet resultSet = stmt.executeQuery();

             while (resultSet.next()) {


             System.out.println(" Employee name" + resultSet.getString("name") + " Dept " + resultSet.getString("dept"));
    }

  }
   public static void namedParameters(String id) throws Exception {


       Class.forName("com.mysql.cj.jdbc.Driver");


       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "sonar");


       Statement stmt = con.createStatement();


       ResultSet resultSet = stmt.executeQuery("select * from sonar.Employee where id = " + id);

       while (resultSet.next()) {


       System.out.println(" Employee name" + resultSet.getString("name") + " Dept " + resultSet.getString("dept"));

             }
   }

    public static  Collection<JDBCEmployee>    getHierarchyList(){
        try {
              Map<String,JDBCEmployee> map = new HashMap<>();
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con =    DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","sonar");
                Statement stmt = null;
                ResultSet resultSet=  stmt.executeQuery("select m.name,e.* from sonar.Employee e self join  sonar.Employee m on e.mid=e.id ");

                        while (resultSet.next()) {
                            if (map.containsKey(resultSet.getString(1))) {
                                JDBCEmployee jdbcProject = map.get(resultSet.getString(1));
                                JDBCEmployee employee = new JDBCEmployee();
                                employee.setName(resultSet.getString(3));
                                jdbcProject.getEmployeeList().add(employee);
                            } else {
                                JDBCEmployee jbdcEmployeeManager = new JDBCEmployee();
                                jbdcEmployeeManager.setName(resultSet.getString(1));

                                 JDBCEmployee jbdcEmployeeManagerTeam = new JDBCEmployee();
                                 jbdcEmployeeManagerTeam.setName(resultSet.getString(3));

                                List<JDBCEmployee> jdbcEmployees = new ArrayList<>();

                                jdbcEmployees.add(jbdcEmployeeManagerTeam);

                                jbdcEmployeeManager.setEmployeeList(jdbcEmployees);

                                map.put(resultSet.getString(1), jbdcEmployeeManager);
                            }
                        }
        }catch ( Exception e){

        }
        return  null;
    }

    public static Collection<JDBCProject> getEmpAllocation(){
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        Collection<JDBCProject> jdbcProjects = new ArrayList<>();

        Map<String,JDBCProject> map = new HashMap<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

         con =    DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","sonar");

           stmt =  con.createStatement();

        resultSet=  stmt.executeQuery("select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid ");



       while (resultSet.next()){
           System.out.println("  Project Name "+resultSet.getString(2)+" Employee name"+resultSet.getString("name")+" Dept "+resultSet.getString("dept"));

           if (map.containsKey(resultSet.getString(2))){
                 JDBCProject jdbcProject =   map.get(resultSet.getString(2))  ;
                         JDBCEmployee employee = new JDBCEmployee();
                         employee.setName(resultSet.getString("name"));
                         jdbcProject.getEmployeeList().add(employee);
           }else {
               JDBCProject jdbcProject =   new JDBCProject();
               jdbcProject.setId(resultSet.getInt(1));
               List<JDBCEmployee> jdbcEmployees = new ArrayList<>();
                jdbcProject.setEmployeeList(jdbcEmployees);
                jdbcProject.setName(resultSet.getString(2));
               JDBCEmployee employee = new JDBCEmployee();
               employee.setName(resultSet.getString("name"));
               jdbcEmployees.add(employee);
               map.put(resultSet.getString(2),jdbcProject);
           }

       }


        }catch (Exception e){
            System.out.println("Exception occurred while fetching data "+e);
        } finally {

            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            }catch (Exception e){

            }

        }


                jdbcProjects = map.values();

        return jdbcProjects;


    }
}
