package com.softserve.sevice.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.RoomDao;
import com.softserve.dao.VisaDao;
import com.softserve.domain.Room;
import com.softserve.sevice.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomDao dao;

	@Transactional
	public void insertRoom(Room room) {
		dao.insert(room);

	}

	@Transactional
	public Room find(int id) {
		return dao.find(id);
	}

	@Transactional
	public void update(Room room) {
		dao.update(room);
	}

	@Transactional
	public List<Room> getAllRooms() {
		return dao.getAll();
	}

	@Transactional
	public void delete(int id) {
		dao.delete(id);

	}

	@Transactional
	public List<Room> findByHotelId(int id) {
		return dao.findByHotelId(id);
	}

	@Transactional
	public List<Room> findByRoomType(String type) {
		return dao.findByRoomType(type);
	}

	@Transactional
	public List<Room> findByRoomPrice(int priceFrom, int priceTo) {
		return dao.findByRoomPrice(priceFrom, priceTo);
	}

}
