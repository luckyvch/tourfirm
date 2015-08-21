package com.softserve.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softserve.dao.VisaDao;
import com.softserve.domain.Visa;

@Repository
public class VisaDaoImpl extends BaseDaoImpl<Visa> implements VisaDao {

	public VisaDaoImpl() {
		super(Visa.class);
	}

	
	public Visa findVisaByUserId(int id) {
		return (Visa) VisaDaoImpl.this.getEm()
				.createQuery("from Visa where idClient=:id")
				.setParameter("id", id).getSingleResult();
	}

	
	public List<Visa> findVisasByDate(Date dateFrom, Date dateTo) {
	    @SuppressWarnings("unchecked")
		List<Visa> list = VisaDaoImpl.this.getEm().createQuery("from visa where dateOfIssue>=:dateFrom and dateOfIssue<=:dateTo").
				setParameter("dateFrom", dateFrom).setParameter("dateTo", dateTo).getResultList();
		return list;
	}

}
