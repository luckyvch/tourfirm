package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.VisaDao;
import com.softserve.domain.Visa;
import com.softserve.sevice.VisaService;

@Service("visaServise")
public class VisaServiceImpl implements VisaService{
	
	@Autowired
	private VisaDao dao;

	@Transactional
	public void insertVisa(Visa visa) {
		dao.insert(visa);
	}

	@Transactional
	public Visa find(int id) {
		return dao.find(id);
	}

	@Transactional
	public List<Visa> getAllVisas() {
		return dao.getAll();
	}

	@Transactional
	public void delete(int id) {
		dao.delete(id);		
	}

	@Transactional
	public Visa findVisaByUserId(int id) {
		return dao.findVisaByUserId(id);
	}
}
