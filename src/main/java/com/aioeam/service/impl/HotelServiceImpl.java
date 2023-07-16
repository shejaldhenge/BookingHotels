package com.aioeam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aioeam.entity.Availability;
import com.aioeam.entity.Hotel;
import com.aioeam.repo.HotelRepository;
import com.aioeam.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
    
	@Autowired
	private HotelRepository hotelrepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelrepository.save(hotel);
		}

	@Override
	public Hotel getHotelById(int id) {
		return this.hotelrepository.findById(id).get();
	}
		
	}

	
	

