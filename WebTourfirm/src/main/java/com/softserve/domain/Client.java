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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;



@Entity
@Table(name = "client")
public class Client {

	/** The id client. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idClient;

	/** The name. */
	@Column
	private String fName;

	/** The sname. */
	@Column
	private String sName;

	/** The pasport info. */
	@Column
	private String pasportNumber;

	/** The adress. */
	@Column
	private String adress;

	/** The tel. */
	@Column
	private String tel;

	/** The email. */
	@Column
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
	private List<Visa> visas;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
	private List<Booking> bookings;
	

	/**
	 * Instantiates a new client info.
	 */
	public Client() {}
	
	
	public Client(String fName, String sName,
			String pasportNumber, String adress, String tel, String email) {
		if ((fName == null) && (sName == null) && (pasportNumber == null) && (adress == null)
				&& (tel == null) && (email == null)){
			throw new IllegalArgumentException();
		}
		this.fName = fName;
		this.sName = sName;
		this.pasportNumber = pasportNumber;
		this.adress = adress;
		this.tel = tel;
		this.email = email;
	}


	public int getIdClient() {
		return idClient;
	}

	private void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		if (fName == null) {
			throw new IllegalArgumentException();
		}
		this.fName = fName;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		if (sName == null) {
			throw new IllegalArgumentException();
		}
		this.sName = sName;
	}


	public String getPasportNumber() {
		
		return pasportNumber;
	}


	public void setPasportNumber(String pasportNumber) {
		if (pasportNumber == null) {
			throw new IllegalArgumentException();
		}
		this.pasportNumber = pasportNumber;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		if (adress == null) {
			throw new IllegalArgumentException();
		}
		this.adress = adress;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		if (tel == null) {
			throw new IllegalArgumentException();
		}
		this.tel = tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if (email == null) {
			throw new IllegalArgumentException();
		}
		this.email = email;
	}


	public List<Visa> getVisas() {
		return visas;
	}


	public void setVisas(List<Visa> visas) {
		this.visas = visas;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	@Override
	public String toString() {
		return "ClientInfo [fName=" + fName + ", sName=" + sName
				+ ", pasportNumber=" + pasportNumber + ", adress=" + adress
				+ ", tel=" + tel + ", email=" + email + "]";
	}


	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31).
				   append(idClient).
			       append(fName).
			       append(sName).
			       append(pasportNumber).
			       append(adress).
			       append(tel).
			       append(email).
			       append(visas).
			       append(bookings).
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
		Client client = (Client) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).
					append(idClient, client.idClient).
				    append(fName, client.fName).
				    append(sName, client.sName).
				    append(pasportNumber, client.pasportNumber).
				    append(adress, client.adress).
				    append(tel, client.tel).
				    append(email, client.email).
				    append(visas, client.visas).
				    append(email, client.bookings).
				    isEquals();
	}
	
	
	
	


}
