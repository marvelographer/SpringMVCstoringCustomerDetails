package com.jsp.jese8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.jese8.dto.EmpDto;

//@Component
public class EmpDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(EmpDto emp) {
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();
	}

	public EmpDto findByEmail(String email) {
		EmpDto empDto = entityManager.find(EmpDto.class, email);
		return empDto;
	}

	public void deleteData(EmpDto empDto) {
		entityTransaction.begin();
		entityManager.remove(empDto);
		entityTransaction.commit();
	}

	public void update(EmpDto empDto) {
		entityTransaction.begin();
		entityManager.merge(empDto);
		entityTransaction.commit();
	}

	public List<EmpDto> fetchingAll() {
		Query query = entityManager.createQuery("select data from EmpDto data");
		List<EmpDto> dt = query.getResultList();
		return dt;
	}
}
