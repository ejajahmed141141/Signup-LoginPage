package com.dao;

import javax.persistence.*;
import javax.persistence.Persistence;

import com.dto.Signupdto;

public class SignupDao {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("ejaj");
	EntityManager em= emf.createEntityManager();
	EntityTransaction et= em.getTransaction();

	public void save(Signupdto s) {
		// TODO Auto-generated method stub
		et.begin();
		em.persist(s);
		et.commit();
	}
	
	
}
