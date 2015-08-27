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
	public Client find(int id) {
		return dao.find(id);
	}

	@Transactional
	public List<Client> getAllClients() {
		return dao.getAll();
	}

	@Transactional
	public void delete(int id) {
		dao.delete(id);
	}

	@Transactional
	public void update(Client client) {
		dao.update(client);
	}

	@Transactional
	public boolean contains(Client client) {
		return dao.contains(client);
	}

	@Transactional
	public Client findByPasportNumber(String pasportNumber) {
		return dao.fintClientByPasportNumber(pasportNumber);
	}

	@Transactional
	public boolean containsClient(String pasportNumber) {
		boolean contains = false;
		try {
			Client client = dao.fintClientByPasportNumber(pasportNumber);
			if (!(client == null)) {
				contains = true;
				System.out.println(contains);
				return contains;
			}
		} catch (Exception e) {
			System.out.println(contains);
			return contains;
		}		
		return contains;
	}

	




}
