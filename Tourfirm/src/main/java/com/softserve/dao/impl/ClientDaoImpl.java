package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.dao.ClientDao;
import com.softserve.domain.Client;

@Repository
public class ClientDaoImpl extends BaseDaoImpl<Client> implements ClientDao {

	public ClientDaoImpl() {
		super(Client.class);
	}

}
