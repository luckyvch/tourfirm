package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.dao.CityDao;
import com.softserve.domain.City;

@Repository
public class CityDaoImpl extends BaseDaoImpl<City> implements CityDao{

	public CityDaoImpl() {
		super(City.class);
		
	}

}
