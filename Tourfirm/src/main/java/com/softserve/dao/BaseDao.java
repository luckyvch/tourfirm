package com.softserve.dao;

import java.util.List;

public interface BaseDao<E> {
	
	 void insert(E e);
	
	<T> E find(T id);
	
	List<E> getAll();
	
	<T> void delete (T id);	

}