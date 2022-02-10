package jba.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import jba.hibernate.Student;
import jba.hibernate.JPAUtil;
import java.util.Map;

/**
 *  JPA CRUD Operations
 *
 */
public class CRUDOperations {
    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Student student = new Student("Mirna", "Sokar", "mirna.sokar@gmail.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        // The entity object is physically updated in the database when the transaction
        // is committed
        student.setFirstName("Justin");
        student.setLastName("sokar");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);
        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}