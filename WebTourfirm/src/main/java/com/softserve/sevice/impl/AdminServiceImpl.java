package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.AdminDao;
import com.softserve.domain.Admin;
import com.softserve.sevice.AdminService;

@Service("admin")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao dao;
	
	public void insertBooking(Admin admin) {
				
	}

	public Admin find(int id) {
		return null;
	}

	public List<Admin> getAllBookings() {
		return null;
	}

	public void delete(int id) {
				
	}

	@Transactional
	public Admin findAdminByLoginAndPass(String login, String pass) {
		return dao.findAdminByLoginAndPass(login, pass);
	}

	public void update(Admin admin) {
		
	}

}
