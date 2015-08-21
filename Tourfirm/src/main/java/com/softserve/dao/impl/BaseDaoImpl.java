package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.BaseDao;

@Repository
public class BaseDaoImpl<E> implements BaseDao<E> {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	private Class<E> entityClass;

	private BaseDaoImpl() {

	}

	public BaseDaoImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	
	public void insert(E e) {
		em.persist(e);
	}

	
	public <T> E find(T id) {
		return em.find(entityClass, id);
	}

	
	public List<E> getAll() {
		return em.createQuery("from " + entityClass.getSimpleName())
				.getResultList();
	}

	
	public <T> void delete(T id) {
		em.remove(em.find(entityClass, id));
	}

}
