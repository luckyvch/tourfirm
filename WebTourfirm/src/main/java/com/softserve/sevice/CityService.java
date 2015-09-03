package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.City;

public interface CityService {

	void insertCity(City city);

	City find(int id);

	void update(City city);

	List<City> getAllCities();

	void delete(City city);
}
