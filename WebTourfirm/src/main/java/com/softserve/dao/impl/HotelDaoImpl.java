package com.softserve.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.HotelDao;
import com.softserve.domain.Hotel;
import com.softserve.domain.Room;

@Repository
public class HotelDaoImpl extends BaseDaoImpl<Hotel> implements HotelDao{

	public HotelDaoImpl() {
		super(Hotel.class);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Hotel> findByCityId(int id) {
		return (List<Hotel>) HotelDaoImpl.this.getEm()
				.createQuery("from Hotel where idHCity =:id")
				.setParameter("id", id).getResultList();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Hotel> findByHotelName(String hotelName) {
		return (List<Hotel>) HotelDaoImpl.this.getEm()
				.createQuery("from Hotel where hotelName =:hotelName")
				.setParameter("hotelName", hotelName).getResultList();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Hotel> findByCategory(int category) {
		return (List<Hotel>) HotelDaoImpl.this.getEm()
				.createQuery("from Hotel where category =:category")
				.setParameter("category", category).getResultList();
	}

}
