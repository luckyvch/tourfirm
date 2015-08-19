package com.softserve.app;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.softserve.domain.Client;
import com.softserve.domain.Visa;
import com.softserve.util.Util;

public class MainTest {

	public static void main (String [] args) throws ParseException{
		Session session = Util.currentSession();
		session.beginTransaction();
		Client client = new Client();
		client.setfName("������");
		client.setsName("�����");
		client.setPasportNumber("��0555697");
		client.setAdress("�.����������,���.�.���������,2/33");
		client.setEmail("vch@mail.ru");
		client.setTel("0965551958");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = "2015-08-18";
		Date date = formatter.parse(dateString);
		Visa visa = new Visa("255699874", client, date);
		List<Visa> list = new ArrayList<Visa>();
		list.add(visa);
		client.setVisas(list);
		session.save(client);
		session.getTransaction().commit();
		session.close();
	}
}
