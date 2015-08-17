package com.softserve.domain;


public class ClientInfo {

	/** The id client. */
	private int idClient;

	/** The name. */
	private String fName;

	/** The sname. */
	private String sName;

	/** The pasport info. */
	private String pasportNumber;

	/** The adress. */
	private String adress;

	/** The tel. */
	private String tel;

	/** The email. */
	private String email;
	

	/**
	 * Instantiates a new client info.
	 */
	public ClientInfo() {

	}

	/**
	 * Instantiates a new client info.
	 *
	 * @param idClient
	 *            the id client
	 * @param fName
	 *            the f name
	 * @param sname
	 *            the sname
	 * @param pasportNumber
	 *            the pasport number
	 * @param adress
	 *            the adress
	 * @param tel
	 *            the tel
	 * @param email
	 *            the email
	 */
	public ClientInfo(int idClient, String fName, String sname,
			String pasportNumber, String adress, String tel, String email) {
		this.idClient = idClient;
		this.fName = fName;
		this.sName = sname;
		this.pasportNumber = pasportNumber;
		this.adress = adress;
		this.tel = tel;
		this.email = email;
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
	 * @param idClient
	 *            the new id client
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * Gets the f name.
	 *
	 * @return the f name
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Sets the f name.
	 *
	 * @param fName
	 *            the new f name
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Gets the sname.
	 *
	 * @return the sname
	 */
	public String getsName() {
		return sName;
	}

	/**
	 * Sets the sname.
	 *
	 * @param sname
	 *            the new sname
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}

	/**
	 * Gets the pasport number.
	 *
	 * @return the pasport number
	 */
	public String getPasportNumber() {
		return pasportNumber;
	}

	/**
	 * Sets the pasport number.
	 *
	 * @param pasportNumber
	 *            the new pasport number
	 */
	public void setPasportNumber(String pasportNumber) {
		this.pasportNumber = pasportNumber;
	}

	/**
	 * Gets the adress.
	 *
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * Sets the adress.
	 *
	 * @param adress
	 *            the new adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * Gets the tel.
	 *
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Sets the tel.
	 *
	 * @param tel
	 *            the new tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	

	@Override
	public String toString() {
		return "ClientInfo [fName=" + fName + ", sname=" + sName
				+ ", pasportNumber=" + pasportNumber + ", adress=" + adress
				+ ", tel=" + tel + ", email=" + email + "]";
	}

}
