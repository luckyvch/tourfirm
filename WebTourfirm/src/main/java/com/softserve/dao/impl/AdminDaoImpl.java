package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.dao.AdminDao;
import com.softserve.domain.Admin;

@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	public AdminDaoImpl() {
		super(Admin.class);
		// TODO Auto-generated constructor stub
	}

	public Admin findAdminByLoginAndPass(String login, String pass) {
		return (Admin) AdminDaoImpl.this.getEm().createQuery("from Admin where login=:aLogin and pass=:aPass").
				setParameter("aLogin", login).setParameter("aPass", pass).
				getSingleResult();
	}
	
	

}
