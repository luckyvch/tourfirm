package com.softserve.app;

import org.hibernate.Session;

import com.softserve.util.Util;

public class MainTest {

	public static void main (String [] args){
		Session session = Util.currentSession();
		Util.closeSession();
	}
}
