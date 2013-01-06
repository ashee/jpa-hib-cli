package org.ashee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.*;

public class App  {
  public static void main(String[] args) throws Exception {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-app");
    EntityManager em = emf.createEntityManager();

    EntityTransaction trans = em.getTransaction();
    trans.begin();

    Person p = new Person();
    p.setName("nolan");

    em.persist(p);

    trans.commit();

    await();
  }

  public static String await() throws Exception {
    BufferedReader lineOfText = new BufferedReader(new InputStreamReader(System.in));
    String textLine = lineOfText.readLine();
    return textLine;
  }
}
