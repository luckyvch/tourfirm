package com.softserve.domain;

public class Hotels {

	/** The id of the hotel. */
	private int idHotel;

	/** The id of the city. */
	private int idCity;

	/** The name of the hotel. */
	private String hotelName;

	/** How many -stars the hotel is. */
	private int category;

	/** The location of the hotel. */
	private String location;

	/** The email of the hotel. */
	private String email;

	/** The telephone of the hotel. */
	private String tel;

	
	/**
	 * Instantiates a new hotels.
	 */
	public Hotels() {

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
	public Hotels(int idHotels, int idCity, String hotelName, int category,
			String location, String email, String tel) {
		this.idHotel = idHotel;
		this.idCity = idCity;
		this.hotelName = hotelName;
		this.category = category;
		this.location = location;
		this.email = email;
		this.tel = tel;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return  hotelName + "-hotel id is " + idHotel + " and the city id is "
				+ idCity + ", it is " + category + "-stars hotel. \nContacts: "
				+ "\nLocation: " + location + "\nemail: " + email
				+ "\nTelephone number: " + tel;
	}


}
