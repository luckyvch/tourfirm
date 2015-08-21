package com.softserve.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.ClientDao;
import com.softserve.domain.Client;
import com.softserve.sevice.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao dao;
	
	@Transactional
	public void insertClient(Client client) {
		dao.insert(client);		
	}

	@Transactional
	public Client findClient(int id) {
		return dao.find(id);
	}

	@Transactional
	public List<Client> getAllClients() {
		return dao.getAll();
	}

	@Transactional
	public void deleteClient(int id) {
		dao.delete(id);
	}

}
