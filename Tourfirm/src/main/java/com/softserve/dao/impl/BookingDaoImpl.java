package com.softserve.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softserve.dao.BookingDao;
import com.softserve.domain.Booking;


@Repository
public class BookingDaoImpl extends BaseDaoImpl<Booking> implements BookingDao {

	public BookingDaoImpl() {
		super(Booking.class);
	}

	@SuppressWarnings("unchecked")
	public List<Booking> findByRoomId(int id) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where idRoom =:id")
				.setParameter("id", id).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Booking> findByClientId(int id) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where idClient =:id")
				.setParameter("id", id).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Booking> findByDate(Date dateFrom, Date dateTo) {
		return (List<Booking>) BookingDaoImpl.this.getEm()
				.createQuery("from Booking where dateFrom >=:dateFrom and dateTo <=:dateTo")
				.setParameter("dateFrom", dateFrom)
				.setParameter("dateTo", dateTo)
				.getResultList();
	}

}
