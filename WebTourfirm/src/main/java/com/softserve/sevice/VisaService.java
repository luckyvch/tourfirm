package com.softserve.sevice;

import java.util.List;

import com.softserve.domain.Visa;

public interface VisaService {
	
	void insertVisa (Visa visa);
	
	Visa find (int id);
	
	void update (Visa visa);
	
	List<Visa> getAllVisas();
	
	void delete (Visa visa);
	
	Visa findVisaByUserId (int id);
	
	List<Visa> findVisaByDates(String dateFrom, String dateTo);

}
