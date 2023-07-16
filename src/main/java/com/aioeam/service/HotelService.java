package com.aioeam.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.aioeam.entity.Hotel;

public interface HotelService {
	public Hotel addHotel(Hotel hotel);
	
	public Hotel getHotelById(int id);

}
