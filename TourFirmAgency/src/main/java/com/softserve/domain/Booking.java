package com.softserve.domain;

import java.util.Date;

public class Booking {

	/** The id of the booking. */
	private int idBooking;

	/** The id of the room. */
	private int idRoom;

	/** The name of the client. */
	private int idClient;

	/** Date 'from' room is booked. */
	private Date dateFrom;

	/** Date 'to' room is booked.  */
	private Date dateTo;

	
	/**
	 * Instantiates a new hotels.
	 */
	public Booking() {

	}


	/**
	 * Instantiates a new visas.
	 *  @Param idBooking is the id of the booking;
		@Param idRoom is the id of the room;
		@Param idClient is the name of the client;
		@Param dateFrom is the 'from'-date room is booked;
		@Param dateTo is the 'to'-date from room is booked;
	 */
	public Booking(int idBooking, int idRoom, int idClient, Date dateFrom,
			Date dateTo) {
		this.idBooking = idBooking;
		this.idRoom = idRoom;
		this.idClient = idClient;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public int getIdBooking() {
		return idBooking;
	}


	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}


	public int getIdRoom() {
		return idRoom;
	}


	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public Date getDateFrom() {
		return dateFrom;
	}


	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}


	public Date getDateTo() {
		return dateTo;
	}


	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}


	@Override
	public String toString() {
		return "Booking [idBooking=" + idBooking + ", idRoom=" + idRoom
				+ ", idClient=" + idClient + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + "]";
	}
	
}
