package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.HotelDao;
import com.softserve.domain.Hotel;
import com.softserve.sevice.HotelService;

@Service("hotelService")
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelDao dao;
	
	@Transactional
	public void insertHotel(Hotel hotel) {
		dao.insert(hotel);
	}

	@Transactional
	public Hotel find(int id) {
		return dao.find(id);
	}

	@Transactional
	public void update(Hotel hotel) {
		dao.update(hotel);
	}

	@Transactional
	public List<Hotel> getAllHotels() {
		return dao.getAll();
	}

	@Transactional
	public void delete(Hotel hotel) {
		dao.deleteEntity(hotel);		
	}

	@Transactional
	public List<Hotel> findByCityId(int id) {
		return dao.findByCityId(id);
	}

	@Transactional
	public List<Hotel> findByHotelName(String hotelName) {
		return dao.findByHotelName(hotelName);
	}

	@Transactional
	public List<Hotel> findByCategory(int category) {
		return dao.findByCategory(category);
	}

}
