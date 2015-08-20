package com.softserve.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.BaseDao;


public class BaseDaoImpl<E> implements BaseDao<E> {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	private Class<E> entityClass;
	
	public BaseDaoImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void insert(E e) {
		em.persist(e);
	}

	@Transactional
	public E find(int id) {
		return em.find(entityClass, id);
	}
	
	@Transactional
	public List<E> getAll() {
		return em.createQuery("from " + entityClass.getSimpleName()).getResultList();
	}

	@Transactional
	public void delete(int id) {
		em.remove(em.find(entityClass, id));	
	}

}
