package com.softserve.dao.impl;

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

	@SuppressWarnings("unchecked")
	public List<Visa> findVisasByDate(String dateFrom, String dateTo) {
	    StringBuilder builder = new StringBuilder("from Visa ");
	    builder.append(" where dateOfIssue>='" + dateFrom + "'");
	    builder.append(" and dateOfIssue<='" + dateTo + "'");
		List<Visa> list = VisaDaoImpl.this.getEm().createQuery(builder.toString()).getResultList();
		return list;
	}

}
