package com.softserve.sevice;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.softserve.domain.Visa;

public interface VisaService {
	
	void insertVisa (Visa visa);
	
	Visa find (int id);
	
	List<Visa> getAllVisas();
	
	void delete (int id);
	
	Visa findVisaByUserId (int id);
	
	List<Visa> findVisaByDates(String dateFrom, String dateTo);

}
