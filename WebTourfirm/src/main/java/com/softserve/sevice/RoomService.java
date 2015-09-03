package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Room;

public interface RoomService {

	void insertRoom(Room room);

	Room find(int id);

	void update(Room room);

	List<Room> getAllRooms();

	void delete(Room room);

	List<Room> findByHotelId(int id);

	List<Room> findByRoomType(String type);

	List<Room> findByRoomPrice(int priceFrom, int priceTo);
}
