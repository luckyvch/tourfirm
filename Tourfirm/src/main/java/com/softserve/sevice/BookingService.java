package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Booking;

public interface BookingService {

	void insertBooking(Booking booking);

	Booking find(int id);

	Booking update(int id);

	List<Booking> getAllBookings();

	void delete(int id);

	List<Booking> findByRoomId(int id);

	List<Booking> findByClientId(String type);

	List<Booking> findByDate(int priceFrom, int priceTo);

}
