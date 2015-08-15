package com.softserve.domain;

/**
 * The Class ClientInfo. This class is used as POJO object witch will work with
 * database data
 */
public class ClientInfo {

	/** The id client. */
	private int idClient;

	/** The fname. */
	private String fname;

	/** The sname. */
	private String sname;

	/** The pasport info. */
	private String pasportInfo;

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
		super();
	}

	/**
	 * Instantiates a new client info.
	 *
	 * @param idClient
	 *            the id client
	 * @param fname
	 *            the fname
	 * @param sname
	 *            the sname
	 * @param pasportInfo
	 *            the pasport info
	 * @param adress
	 *            the adress
	 * @param tel
	 *            the tel
	 * @param email
	 *            the email
	 */
	public ClientInfo(int idClient, String fname, String sname,
			String pasportInfo, String adress, String tel, String email) {
		super();
		this.idClient = idClient;
		this.fname = fname;
		this.sname = sname;
		this.pasportInfo = pasportInfo;
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
	 * Gets the fname.
	 *
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * Sets the fname.
	 *
	 * @param fname
	 *            the new fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * Gets the sname.
	 *
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * Sets the sname.
	 *
	 * @param sname
	 *            the new sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * Gets the pasport info.
	 *
	 * @return the pasport info
	 */
	public String getPasportInfo() {
		return pasportInfo;
	}

	/**
	 * Sets the pasport info.
	 *
	 * @param pasportInfo
	 *            the new pasport info
	 */
	public void setPasportInfo(String pasportInfo) {
		this.pasportInfo = pasportInfo;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientInfo [ fname=" + fname + ", sname=" + sname
				+ ", pasportInfo=" + pasportInfo + ", adress=" + adress
				+ ", tel=" + tel + ", email=" + email + "]";
	}

}
