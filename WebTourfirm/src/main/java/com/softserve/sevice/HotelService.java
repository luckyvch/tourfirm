package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Hotel;

public interface HotelService {

	void insertVisa(Hotel hotel);

	Hotel find(int id);

	void update(Hotel hotel);

	List<Hotel> getAllHotels();

	void delete(Hotel hotel);

}
