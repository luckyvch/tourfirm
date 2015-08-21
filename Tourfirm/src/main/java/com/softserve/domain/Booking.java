package com.softserve.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idBooking;

	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "idRoom")
	private Room room;

	@Column
	@Temporal(value=TemporalType.DATE)
	private Date dateFrom;

	@Column
	@Temporal(value=TemporalType.DATE)
	private Date dateTo;
	
	public Booking(){
		
	}

	public Booking(int idBooking, Client client, Room room, Date dateFrom,
			Date dateTo) {
		setIdBooking(idBooking);
		this.client = client;
		this.room = room;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public int getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getIdBooking())
				.append(getClient()).append(getRoom()).append(getDateFrom())
				.append(getDateTo()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		Booking booking = (Booking) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
				.append(getIdBooking(), booking.getIdBooking())
				.append(getClient(), booking.getClient())
				.append(getRoom(), booking.getRoom())
				.append(getDateFrom(), booking.getDateFrom())
				.append(getDateTo(), booking.getDateTo()).isEquals();
	}

	@Override
	public String toString() {
		return "Booking [idBooking=" + idBooking + ", client=" + client
				+ ", room=" + room + ", dateFrom=" + dateFrom + ", dateTo="
				+ dateTo + "]";
	}

}
