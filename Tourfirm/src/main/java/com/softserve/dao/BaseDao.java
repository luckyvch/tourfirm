package com.softserve.dao;

import java.util.List;

public interface BaseDao<E> {
	
	void insert(E e);
	
	E find(int id);
	
	List<E> getAll();
	
	void delete (int id);	

}
