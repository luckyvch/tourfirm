package com.softserve.domain;

import java.util.Date;

public class Visas {
	
	/** The id visa. */
	private int idVisa;
	
	/** The id client. */
	private int idClient;
	
	/** The date. */
	private Date dateOfIssue;

	/**
	 * Instantiates a new visas.
	 */
	public Visas() {
		
	}

	/**
	 * Instantiates a new visas.
	 *
	 * @param idVisa the id visa
	 * @param idClient the id client
	 * @param date the date
	 */
	public Visas(int idVisa, int idClient, Date date) {
		this.idVisa = idVisa;
		this.idClient = idClient;
		this.dateOfIssue = date;
	}

	/**
	 * Gets the id visa.
	 *
	 * @return the id visa
	 */
	public int getIdVisa() {
		return idVisa;
	}

	/**
	 * Sets the id visa.
	 *
	 * @param idVisa the new id visa
	 */
	public void setIdVisa(int idVisa) {
		this.idVisa = idVisa;
	}

	/**
	 * Gets the id client.
	 *
	 * @return the id client
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * Sets the id client.
	 *
	 * @param idClient the new id client
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDateOfIssue(Date date) {
		this.dateOfIssue = date;
	}

	@Override
	public String toString() {
		return "Visas [idClient=" + idClient + ", date=" + dateOfIssue + "]";
	}
	
	

}
