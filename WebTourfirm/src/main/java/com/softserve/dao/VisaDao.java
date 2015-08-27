package com.softserve.dao;

import java.util.List;

import com.softserve.domain.Visa;

public interface VisaDao extends BaseDao<Visa> {
	
	Visa findVisaByUserId(int id);
	
	List<Visa> findVisasByDate(String dateFrom, String dateTo);

}
