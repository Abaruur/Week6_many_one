package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class MyController{
public void createManytoOne()
        {
        // This method will generate Depart and Teacher table for
        // ManytoOne
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        // session.close();

        }

public void InsertRecordManytoOne()
        {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        //  We can use insert query or Hibernate build in MEthod()
        // session.save()

        Department dep1 = new Department();
        //dep1.setDid(1);
        dep1.setDname("HR");

        Department dep2 = new Department();
        dep2.setDname("Computer Science");

        Department dep3 = new Department();
        dep3.setDname("Finance");

        Teacher t1 = new Teacher();
        t1.setSalary("200");
        t1.setTeachername("Haseeb");
        t1.setDep(dep1);

        Teacher t2 = new Teacher();
        t2.setSalary("250");
        t2.setTeachername("James");
        t2.setDep(dep1);

        Teacher t3 = new Teacher();
        t3.setSalary("330");
        t3.setTeachername("Alex");
        t3.setDep(dep2);

        Teacher t4 = new Teacher();
        t4.setSalary("330");
        t4.setTeachername("Neil");
        t4.setDep(dep3);

        session.save(dep1);
        session.save(dep2);
        session.save(dep3);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);

        t.commit();
        session.close();
        factory.close();
        }

public void showManytoone()
        {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        TypedQuery t = session.createQuery("SELECT  t from Teacher t");
        List<Teacher> tlist = t.getResultList();
        for (Teacher teacher : tlist)
        {
        System.out.println(teacher.getTeachername());
        System.out.println(teacher.getDep());
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getTit());
        System.out.println(teacher.getDep());
        System.out.println("--------------------------");
        }

        }
}