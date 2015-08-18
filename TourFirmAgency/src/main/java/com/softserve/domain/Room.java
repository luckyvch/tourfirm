package com.softserve.domain;

public class Room {
	
	/** The id of the room. */
	private int idRoom;
	
	/** The id of the hotel. */
	private int idHotel;
	
	/** The number of the room. */
	private int roomNumber;
	
	/** Beds quantity in the room. */
	private int beds;
	
	/** Price per night of the room */
	private int price;

	/**
	 * @param The id of the room.
	 * @param The id of the hotel.
	 * @param The number of the room.
	 * @param Beds quantity in the room.
	 * @param Price per night of the room
	 */
	public Room(int idRoom, int idHotel, int roomNumber, int beds, int price) {
		super();
		this.idRoom = idRoom;
		this.idHotel = idHotel;
		this.roomNumber = roomNumber;
		this.beds = beds;
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", idHotel=" + idHotel
				+ ", roomNumber=" + roomNumber + ", beds=" + beds + ", price="
				+ price + "]";
	}
	

}
