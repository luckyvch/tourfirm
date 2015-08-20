package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.VisaDao;
import com.softserve.domain.Visa;
import com.softserve.sevice.VisaService;

@Service("visaServise")
public class VisaServiceImpl implements VisaService{
	
	@Autowired
	private VisaDao dao;

	public void insertVisa(Visa visa) {
		dao.insert(visa);
	}

	public Visa find(int id) {
		return dao.find(id);
	}

	public List<Visa> getAllVisas() {
		return dao.getAll();
	}

	public void delete(int id) {
		dao.delete(id);		
	}

	public void findVisaByUserId(int id) {
		
	}
}
