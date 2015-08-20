package com.softserve.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.domain.Client;
import com.softserve.domain.Visa;
import com.softserve.sevice.ClientService;
import com.softserve.sevice.VisaService;

public class Main {
	
	public static void main (String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/appContext.xml");
		VisaService visaService = (VisaService) context.getBean("visaServise");
		ClientService clientService = (ClientService) context.getBean("clientService");
		clientService.insertClient(new Client("Василь", "Чопик", "bla", "bla", "bla", "bla"));
		
	}

}
