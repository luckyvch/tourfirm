package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.VisaDao;
import com.softserve.domain.Visa;

@Repository
public class VisaDaoImpl extends BaseDaoImpl<Visa> implements VisaDao {

	public VisaDaoImpl() {
		super(Visa.class);
	}

	@Transactional
	public Visa findVisaByUserId(int id) {
		return (Visa) VisaDaoImpl.this.getEm()
				.createQuery("from Visa where idClient=:id")
				.setParameter("id", id).getSingleResult();
	}

}
