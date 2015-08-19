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
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	/** The id of the city. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCity;
	
	/** The name of the city. */
	@Column
	private String name;
	
	/** The country of the city. */
	@Column
	private String country;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "city")

	private List<Hotel> hotelList;

	/**
	 * @param The id of the city.
	 * @param The name of the city.
	 * @param The country of the city.
	 */
	public City(int idCity, String name, String country) {
		super();
		this.idCity = idCity;
		this.name = name;
		this.country = country;
	}

	/**
	 * @return the id of the city
	 */
	public int getIdCity() {
		return idCity;
	}

	/**
	 * @param idCity city id to set
	 */
	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	/**
	 * @return the name of the city
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name City name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country of the city
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country of the city to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", name=" + name + ", country="
				+ country + "]";
	}
	
	

}
