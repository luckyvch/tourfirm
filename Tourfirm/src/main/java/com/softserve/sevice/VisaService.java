package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Visa;

public interface VisaService {
	
	void insertVisa (Visa visa);
	
	Visa find (int id);
	
	List<Visa> getAllVisas();
	
	void delete (int id);
	
	void findVisaByUserId (int id);

}
