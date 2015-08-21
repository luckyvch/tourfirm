package com.softserve.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.softserve.dao.BookingDao;
import com.softserve.domain.Booking;
import com.softserve.domain.Room;

public class BookingDaoImpl extends BaseDaoImpl<Booking> implements BookingDao {

	public BookingDaoImpl() {
		super(Booking.class);
	}

	public List<Booking> findByRoomId(int id) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where idRoom =:id")
				.setParameter("id", id).getResultList();
	}

	public List<Booking> findByClientId(int id) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where idClient =:id")
				.setParameter("id", id).getResultList();
	}

	public List<Booking> findByDate(Date dateFrom, Date dateTo) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where dateFrom >=:dateFrom and dateTo <=:dateTo")
				.setParameter("dateFrom", dateFrom)
				.setParameter("dateTo", dateTo)
				.getResultList();
	}

}
