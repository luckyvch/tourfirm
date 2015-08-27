package com.softserve.dao;

import java.util.Date;
import java.util.List;

import com.softserve.domain.Booking;
import com.softserve.domain.Client;
import com.softserve.domain.Room;

public interface BookingDao extends BaseDao<Booking> {

	List<Booking> findByRoomId(int id);
	
	List<Booking> findByClientId(int id);
	
	List<Booking> findByDate(Date dateFrom, Date dateTo);
	
}
