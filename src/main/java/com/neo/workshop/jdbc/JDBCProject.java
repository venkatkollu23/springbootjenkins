package com.neo.workshop.jdbc;

import java.util.Date;
import java.util.List;

public class JDBCProject {

    private int id;

    private String name;

    private Date startDate;

    private Date endDate;


    private List<JDBCEmployee> employeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<JDBCEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<JDBCEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "JDBCProject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", employeeList=" + employeeList +
                '}';
    }
}
