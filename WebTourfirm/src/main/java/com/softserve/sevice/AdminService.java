package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Admin;

public interface AdminService {

	void insertBooking(Admin admin);

	Admin find(int id);

	void update(Admin admin);

	List<Admin> getAllBookings();

	void delete(int id);
	
	Admin findAdminByLoginAndPass(String login, String pass);
	
}
