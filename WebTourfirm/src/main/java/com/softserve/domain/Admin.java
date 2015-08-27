package com.softserve.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String login;
	
	@Column
	private String pass;
	
	public Admin(String aName, String pass) {
		super();
		this.login = aName;
		this.pass = pass;
	}

	public Admin() {
		super();
	}

	public String getaName() {
		return login;
	}

	public void setaName(String aName) {
		this.login = aName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
