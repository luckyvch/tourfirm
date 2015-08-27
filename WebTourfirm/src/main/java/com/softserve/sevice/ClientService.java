package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Client;

public interface ClientService {
	
	void insertClient (Client client);
	
	Client find (int id);
	
	void update (Client client);
	
	List<Client> getAllClients();
	
	void delete (int id);
	
	boolean contains(Client client);
	
	Client findByPasportNumber (String pasportNumber);
	
	boolean containsClient (String pasportNumber);
	

}
