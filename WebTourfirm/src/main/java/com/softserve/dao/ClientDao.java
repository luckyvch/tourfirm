package com.softserve.dao;

import com.softserve.domain.Client;

public interface ClientDao extends BaseDao<Client> {
	boolean contains(Client client);
	
	Client fintClientByPasportNumber(String pasportNumber);
}
