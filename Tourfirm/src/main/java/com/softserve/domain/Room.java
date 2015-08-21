package com.softserve.domain;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Set;
>>>>>>> konon

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
	private String roomType;

	@Column
	private int roomPrice;
	
<<<<<<< HEAD
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "room")
=======
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "room")
>>>>>>> konon
	private List<Booking> booking;
	
	public Room(){
		
	}

	public Room(int idRoom, Hotel hotel, int roomNumber, String roomType,
			int roomPrice) {
		setIdRoom(idRoom);
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

}
