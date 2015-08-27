package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.softserve.domain.Client;
import com.softserve.sevice.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/apply", method = RequestMethod.POST, consumes="application/json")
	public void apply(@RequestBody Client client){
		clientService.insertClient(client);
	}

}
