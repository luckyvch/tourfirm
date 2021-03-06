package com.softserve.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	/** The id of the hotel. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHotel;

	/** The id of the city. */
	@ManyToOne
	@JoinColumn(name = "idCity")
	private City city;

	/** The name of the hotel. */
	@Column
	private String hotelName;

	/** How many -stars the hotel is. */
	@Column
	private int category;

	/** The location of the hotel. */
	@Column
	private String location;

	/** The email of the hotel. */
	@Column
	private String emailHotel;

	/** The telephone of the hotel. */
	@Column
	private String telHotel;

	
	/**
	 * Instantiates a new hotels.
	 */
	public Hotel() {

	}

	/**
	 * Instantiates a new visas.
	 *  @Param idHotel is the id of the hotel; 
	 *  @Param idCity is the id of the city;
	 *  @Param hotelName is the name of the hotel;
	 *  @Param category is the category of the hotel; 
	 *  @Param location is the location of the hotel; 
	 *  @Param email is the email of the hotel;
	 *  @Param tel is the telephone number of the hotel;
	 */
	public Hotel(int idHotels, City city, String hotelName, int category,
			String location, String emailHotel, String telHotel) {
		setIdHotel(idHotel);
		this.city = city;
		this.hotelName = hotelName;
		this.category = category;
		this.location = location;
		this.emailHotel = emailHotel;
		this.telHotel = telHotel;
	}

	public int getIdHotel() {
		return idHotel;
	}

	private void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public City getIdCity() {
		return city;
	}

	public void setIdCity(City city) {
		this.city = city;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailHotel() {
		return emailHotel;
	}

	public void setEmailHotel(String emailHotel) {
		this.emailHotel = emailHotel;
	}

	public String getTelHotel() {
		return telHotel;
	}

	public void setTelHotel(String telHotel) {
		this.telHotel = telHotel;
	}

	@Override
	public String toString() {
		return  hotelName + "-hotel id is " + idHotel + " and the city id is "
				+ city + ", it is " + category + "-stars hotel. \nContacts: "
				+ "\nLocation: " + location + "\nemail: " + emailHotel
				+ "\nTelephone number: " + telHotel;
	}

}
