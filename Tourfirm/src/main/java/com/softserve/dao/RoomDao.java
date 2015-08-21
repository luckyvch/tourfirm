package com.softserve.dao;

import java.util.List;

import com.softserve.domain.Room;

public interface RoomDao extends BaseDao<Room> {

	List<Room> findByHotelId(int id);

	List<Room> findByRoomType(String type);
	
	List<Room> findByRoomPrice(int priceFrom, int priceTo);

}
