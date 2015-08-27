package com.softserve.controller;

import java.util.List;

import org.springframework.aop.aspectj.AspectJAdviceParameterNameDiscoverer.AmbiguousBindingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softserve.domain.Admin;
import com.softserve.domain.City;
import com.softserve.domain.Client;
import com.softserve.domain.Hotel;
import com.softserve.sevice.AdminService;
import com.softserve.sevice.CityService;
import com.softserve.sevice.HotelService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private HotelService hotelService;
	
	private boolean loginStatus;
	
	private Admin admin = new Admin(); 
	
	@RequestMapping(value="admin")
	private String ShowLoginForm(){
		return "loginForm";
	}
	
	@RequestMapping(value="/login")
	private String Login(@RequestParam(value="login") String login, 
			@RequestParam(value="pass") String pass, Model model){
		Admin admin = adminService.findAdminByLoginAndPass(login, pass);
		if (!(admin == null)){
			this.loginStatus = true;
			this.admin = admin;
		}
		return "adminPage";
	}
	
	@RequestMapping(value="/logOut")
	private String LoginOut(Model model){
		this.loginStatus = false;
		return "redirect:/admin";
	}
	
	@RequestMapping(value="getStatus", method = RequestMethod.GET)
	private String SendLoginStatus(Model model){
		model.addAttribute("loginStatus", loginStatus);
		model.addAttribute("admin", admin.getaName());
		return "";
	}
	
	@RequestMapping(value="/getAllCities", method = RequestMethod.GET)
	private String getAllCities(Model model) {
		List<City> list = cityService.getAllCities();
		model.addAttribute("city", list);
		return "adminPage";
	}
	
	@RequestMapping(value="/getAllHotels", method = RequestMethod.GET)
	private String getAllHotels(Model model) {
		List<Hotel> list = hotelService.getAllHotels();
		model.addAttribute("hotels", list);
		return "adminPage";
	}
	
	@RequestMapping(value="/getCity/{idCity}", method = RequestMethod.GET)
	private void getAllHotels(@PathVariable ("idCity") String idCityString, Model model) {
		int idCity = Integer.parseInt(idCityString);
		City city = cityService.find(idCity);
		model.addAttribute("city", city);
	}
	
	@RequestMapping(value="*/updateCity", method = RequestMethod.POST, consumes="application/json")
	public void updateCity(@RequestBody City city){
		cityService.update(city); 
	}
}
