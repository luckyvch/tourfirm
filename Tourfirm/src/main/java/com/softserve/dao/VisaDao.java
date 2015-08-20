package com.softserve.dao;

import com.softserve.domain.Visa;

public interface VisaDao extends BaseDao<Visa> {
	
	Visa findVisaByUserId(int id);

}
