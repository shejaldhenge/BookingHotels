package com.aioeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aioeam.entity.Hotel;
import com.aioeam.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelservice; 
	
	
	@PostMapping("/AddHotel")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return this.hotelservice.addHotel(hotel);
		
	}
	
	@GetMapping("/gethotelbyid/{id}")
	public Hotel getHotelById(@PathVariable int id) {
		return this.hotelservice.getHotelById(id);
	}

}
