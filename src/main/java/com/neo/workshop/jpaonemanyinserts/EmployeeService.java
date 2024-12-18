package com.neo.workshop.jpaonemanyinserts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    public void saveJpa(Project project) {

        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        ProjectOneToManyEntity projectEntity = new ProjectOneToManyEntity();

        projectEntity.setName(project.getName());
        projectEntity.setStartDate(project.getStartDate());
        projectEntity.setEndDate(project.getEndDate());

        List<EmployeeOneManyEntity> employeeEntityList = new ArrayList<>();

        for (int i=0;i<project.getEmployeeList().size();i++){
          Employee emp =   project.getEmployeeList().get(i);
            EmployeeOneManyEntity employeeEntity = new EmployeeOneManyEntity();
            employeeEntity.setName(emp.getName());
            employeeEntity.setDept(emp.getDept());
            employeeEntity.setState(emp.getState());
            employeeEntity.setSalary(emp.getSalary());
            employeeEntity.setProjectEntity(projectEntity);

            employeeEntityList.add(employeeEntity);

        }

        projectEntity.setEmployeeEntityList(employeeEntityList);

        entityManager.persist(projectEntity);
        entityManager.getTransaction().commit();


    }

    public List<ProjectOneToManyEntity> getEmpProjectMap(){

        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



       Query query =  entityManager
               .createQuery(" select  p from ProjectEntity p  ",
                       ProjectOneToManyEntity.class);
        List<ProjectOneToManyEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectOneToManyEntity> projectEmpInnerjoin(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  p from ProjectEntity p inner join p.employeeEntityList e where p.id=e.pid  ",
                        ProjectOneToManyEntity.class);
        List<ProjectOneToManyEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectOneToManyEntity> nplusone(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  distinct(p) from ProjectEntity p join fetch p.employeeEntityList ",
                        ProjectOneToManyEntity.class);
        List<ProjectOneToManyEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }
}
