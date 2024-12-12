package com.neo.workshop.jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(schema = "sonar",name = "Employee")
public class EmployeeEntity {

    public EmployeeEntity(){

    }


    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="dept")
    private String dept;

    @Column(name = "salary")
    private  double salary;

    @Column(name = "state")
    private String state;

    @Column(name = "pid",insertable = false,updatable = false)
    private int pid;


    @ManyToOne
    @JoinColumns( @JoinColumn( name = "pid",referencedColumnName = "id"))
    private ProjectEntity projectEntity;




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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", state='" + state + '\'' +
                ", pid=" + pid +
                '}';
    }
}
