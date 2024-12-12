package com.neo.workshop.jpa.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeService {

    public List<ProjectEntity> getEmpProjectMap(){

        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



       Query query =  entityManager
               .createQuery(" select  p from ProjectEntity p  ",
                       ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectEntity> projectEmpInnerjoin(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  p from ProjectEntity p inner join p.employeeEntityList e where p.id=e.pid  ",
                        ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectEntity> nplusone(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  distinct(p) from ProjectEntity p join fetch p.employeeEntityList ",
                        ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }
}
