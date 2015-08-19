package com.softserve.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * The Class Visa.
 */
@Entity
@Table(name = "visa")
public class Visa {
	
		
	/** The visa number. */
	@Id
	private String visaNumber;
	
	/** The id client. */
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	/** The date. */
	@Column
	@Temporal(value=TemporalType.DATE)
	private Date dateOfIssue;

	/**
	 * Instantiates a new visas.
	 */
	public Visa() {
		
	}
	
	public Visa(String visaNumber, Client client, Date dateOfIssue) {
		super();
		setVisaNumber(visaNumber);
		this.client = client;
		this.dateOfIssue = dateOfIssue;
	}

	public String getVisaNumber() {
		return visaNumber;
	}

	private void setVisaNumber(String visaNumber) {
		this.visaNumber = visaNumber;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	@Override
	public String toString() {
		return "Visa [visaNumber=" + visaNumber + ", client=" + client
				+ ", dateOfIssue=" + dateOfIssue + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(15, 35).
				   append(visaNumber).
			       append(client).
			       append(dateOfIssue).
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
		Visa visa = (Visa) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).
					append(visaNumber, visa.visaNumber).
				    append(client, visa.client).
				    append(dateOfIssue, visa.dateOfIssue).
				    isEquals();
	}

	
	
	
	

}
