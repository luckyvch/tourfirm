package com.softserve.domain;

import javax.persistence.*;

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
	private int roomType;
	
	@Column
	private int roomPrice;

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

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
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
		return new HashCodeBuilder(10, 40).
				   append(idRoom).
			       append(hotel).
			       append(roomNumber).
			       append(roomType).
			       append(roomPrice).
			       toHashCode();
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
		Room room  = (Room) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).
				   append(idRoom, room.idRoom).
				   append(hotel, room.hotel).
			       append(roomNumber, room.roomNumber).
			       append(roomType, room.roomType).
			       append(roomPrice, room.roomPrice).
				    isEquals();
	}
	
}
