package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserve.dao.ClientDao;
import com.softserve.domain.Client;

@Repository
public class ClientDaoImpl extends BaseDaoImpl<Client> implements ClientDao {

	public ClientDaoImpl() {
		super(Client.class);
	}

	public boolean contains(Client client) {
		return ClientDaoImpl.this.getEm().contains(client);
	}

	public Client fintClientByPasportNumber(String pasportNumber) {
		return (Client) ClientDaoImpl.this.getEm().createQuery("from Client where pasportNumber=:pasportNumber").
					setParameter("pasportNumber", pasportNumber).getSingleResult(); 		
	}	
	
	
	

}
