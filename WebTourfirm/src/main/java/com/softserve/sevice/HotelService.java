package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Hotel;

public interface HotelService {

	void insertHotel(Hotel hotel);

	Hotel find(int id);

	void update(Hotel hotel);

	List<Hotel> getAllHotels();

<<<<<<< HEAD
	void delete(Hotel hotel);
=======
	void delete(int id);
	
	List<Hotel> findByCityId(int id);

	List<Hotel> findByHotelName(String hotelName);
	
	List<Hotel> findByCategory(int category);
>>>>>>> 3cf61f65f240d988add1563d5d2a29a33bff3e85

}
