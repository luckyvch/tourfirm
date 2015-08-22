package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Client;

public interface ClientService {
	
	void insertClient (Client client);
	
	Client find (int id);
	
	Client update (int id);
	
	List<Client> getAllClients();
	
	void delete (int id);

}
