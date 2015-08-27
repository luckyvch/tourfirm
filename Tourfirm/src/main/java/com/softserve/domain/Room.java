package com.softserve.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRoom;

	@ManyToOne
	@JoinColumn(name = "idHotel")
	private Hotel hotel;

	@Column
	private int roomNumber;

	@Column
	private String roomType;

	@Column
	private int roomPrice;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "room")
	private List<Booking> bookings;
	
	public Room(){

	}

	public Room(Hotel hotel, int roomNumber, String roomType,
			int roomPrice) {
		this.hotel = hotel;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getIdRoom())
				.append(getHotel()).append(getRoomNumber())
				.append(getRoomType()).append(getRoomPrice()).toHashCode();
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
		Room room = (Room) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
				.append(getIdRoom(), room.getIdRoom())
				.append(getHotel(), room.getHotel())
				.append(getRoomNumber(), room.getRoomNumber())
				.append(getRoomType(), room.getRoomType())
				.append(getRoomPrice(), room.getRoomPrice()).isEquals();
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", hotel=" + hotel + ", roomNumber="
				+ roomNumber + ", roomType=" + roomType + ", roomPrice="
				+ roomPrice + ", bookings=" + bookings + "]";
	}

}
