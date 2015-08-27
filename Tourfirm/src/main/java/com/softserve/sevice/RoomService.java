package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Hotel;
import com.softserve.domain.Room;

public interface RoomService {

	void insertRoom(int id, int roomNumber, String roomType, int roomPrice);

	void delete(int id);

	List<Room> findByHotelId(int id);

	List<Room> findByRoomType(String type);

	List<Room> findByRoomPrice(int priceFrom, int priceTo);
}
