package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Client;

public interface ClientService {
	
	void insertClient (Client client);
	
	Client findClient (int id);
	
	List<Client> getAllClients();
	
	void deleteClient (int id);

}
