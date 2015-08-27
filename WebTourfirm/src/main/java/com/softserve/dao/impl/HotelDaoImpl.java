package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.dao.HotelDao;
import com.softserve.domain.Hotel;

@Repository
public class HotelDaoImpl extends BaseDaoImpl<Hotel> implements HotelDao{

	public HotelDaoImpl() {
		super(Hotel.class);
		// TODO Auto-generated constructor stub
	}

}
