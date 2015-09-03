package com.softserve.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserve.domain.City;
import com.softserve.domain.Client;
import com.softserve.domain.Visa;
import com.softserve.sevice.CityService;
import com.softserve.sevice.ClientService;
import com.softserve.sevice.VisaService;

public class Main {
	
	public static void main (String [] args) throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/appContext.xml");
//		VisaService visaService = (VisaService) context.getBean("visaService");
		ClientService clientService = (ClientService) context.getBean("clientService");
		System.out.println(clientService.containsClient("ВВ02752"));
		CityService cityService = (CityService) context.getBean("cityService");
		
		City city = new City();
		city.setName("Вашингтон");
		city.setCountry("Україна");
		cityService.insertCity(city);
//		List<City> list = cityService.getAllCities();
//		for (City city : list) {
//			System.out.println(city);
//		}
//		clientService.insertClient(new Client("Василь", "Чопик", "bla", "bla", "bla", "bla"));
//		Client client = new Client("448", "hdfgui", "hdbzjkfd", "djfadjs", "fhjbsdh", "afdhkh");
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		String dateString = "2015-08-18";
//		Date date = formatter.parse(dateString);
//		clientService.insertClient(client);
//		visaService.insertVisa(new Visa("5454156616", client, date));
//		Visa visa = visaService.findVisaByUserId(2);
//		System.out.println(visa);
//		List<Visa> list = visaService.getAllVisas();
//		for (Visa visa2 : list) {
//			System.out.println(visa2);
//		}
//		Client client2 = clientService.findClient(2);
//		List<Visa> setVisas =  client.getVisas();
//		for (Visa visa2 : setVisas) {
//			System.out.println(visa2);
//		}
//		List<Visa> list = visaService.findVisaByDates("2014-04-03", "2015-03-28");
//		for (Visa visa : list) {
//			System.out.println(visa.getVisaNumber() + " " + visa.getDateOfIssue());
//		}
		
	}

}
