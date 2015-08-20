package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.ClientDao;
import com.softserve.domain.Client;
import com.softserve.sevice.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao dao;
	
	public void insertClient(Client client) {
		dao.insert(client);		
	}

	public Client findClient(int id) {
		return dao.find(id);
	}

	public List<Client> getAllClients() {
		return dao.getAll();
	}

	public void deleteClient(int id) {
		dao.delete(id);
	}

}
