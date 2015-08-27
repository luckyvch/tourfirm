package com.softserve.dao;

import com.softserve.domain.Admin;

public interface AdminDao extends BaseDao<Admin>{

	Admin findAdminByLoginAndPass(String login, String pass);
	
}
