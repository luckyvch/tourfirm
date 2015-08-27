package com.softserve.dao;

import java.util.List;

import com.softserve.domain.Hotel;
import com.softserve.domain.Room;

public interface HotelDao extends BaseDao<Hotel> {

	List<Hotel> findByCityId(int id);

	List<Hotel> findByHotelName(String hotelName);
	
	List<Hotel> findByCategory(int category);
}
