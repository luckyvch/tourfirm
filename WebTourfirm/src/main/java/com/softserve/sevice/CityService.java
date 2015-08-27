package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.City;

public interface CityService {

	void insertVisa(City city);

	City find(int id);

	void update(City city);

	List<City> getAllCities();

	void delete(int id);
}
