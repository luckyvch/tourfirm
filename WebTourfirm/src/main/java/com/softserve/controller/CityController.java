package com.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserve.domain.City;
import com.softserve.sevice.CityService;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/apply", method = RequestMethod.POST, consumes="application/json")
	public void apply(@RequestBody City city){
		cityService.insertCity(city);
	}
}
