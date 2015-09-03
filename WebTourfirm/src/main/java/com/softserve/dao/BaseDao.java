package com.softserve.dao;

import java.util.List;

public interface BaseDao<E> {
	
	void insert(E e);
	 
	void update(E e);
	
	<T> E find(T id);
	
	List<E> getAll();
	
	void deleteEntity (E e);	

}
