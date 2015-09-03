package com.softserve.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.RoomDao;
import com.softserve.domain.Room;

@Repository
public class RoomDaoImpl extends BaseDaoImpl<Room> implements RoomDao {

	public RoomDaoImpl() {
		super(Room.class);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Room> findByHotelId(int id) {
		return (List<Room>) RoomDaoImpl.this.getEm()
				.createQuery("from Room where idHotel =:id")
				.setParameter("id", id).getResultList();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Room> findByRoomType(String type) {
		return (List<Room>) RoomDaoImpl.this.getEm()
				.createQuery("from Room where roomType =:type")
				.setParameter("type", type).getResultList();
	}

	@Transactional
	public List<Room> findByRoomPrice(int priceFrom, int priceTo) {
		return (List<Room>) RoomDaoImpl.this.getEm()
				.createQuery("from Room where roomPrice between :priceFrom and :priceTo")
				.setParameter("priceFrom", priceFrom)
				.setParameter("priceTo", priceTo)
				.getResultList();
	}
	
	

	
	
}
