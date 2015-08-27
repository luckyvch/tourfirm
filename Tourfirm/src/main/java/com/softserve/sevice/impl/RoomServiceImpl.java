package com.softserve.sevice.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.RoomDao;
import com.softserve.dao.VisaDao;
import com.softserve.domain.Hotel;
import com.softserve.domain.Room;
import com.softserve.sevice.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomDao roomDao;

	@Transactional
	public void insertRoom(int hotelId, int roomNumber, String roomType, int roomPrice) {
		//roomDao.insert(new Room(hotel,roomNumber,roomType,roomPrice));
	}


	@Transactional
	public void delete(int id) {
		roomDao.delete(id);
	}

	@Transactional
	public List<Room> findByHotelId(int id) {
		return roomDao.findByHotelId(id);
	}

	@Transactional
	public List<Room> findByRoomType(String type) {
		return roomDao.findByRoomType(type);
	}

	@Transactional
	public List<Room> findByRoomPrice(int priceFrom, int priceTo) {
		return roomDao.findByRoomPrice(priceFrom, priceTo);
	}

}
