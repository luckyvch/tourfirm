package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.CityDao;
import com.softserve.domain.City;
import com.softserve.sevice.CityService;

@Service("cityService")
public class CityServiseImpl implements CityService{

	@Autowired
	private CityDao dao;
	
	@Transactional
	public void insertCity(City city) {
		dao.insert(city);
	}

	@Transactional
	public City find(int id) {
		return dao.find(id);
	}

	@Transactional
	public void update(City city) {
		dao.update(city);
	}

	@Transactional
	public List<City> getAllCities() {
		return dao.getAll();
	}
	
	@Transactional
	public void delete(City city) {
		dao.deleteEntity(city);
	}

}
