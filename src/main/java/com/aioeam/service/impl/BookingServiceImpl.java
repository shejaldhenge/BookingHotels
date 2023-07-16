package com.aioeam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aioeam.entity.Booking;
import com.aioeam.entity.BookingRequest;
import com.aioeam.repo.BookingRepository;
import com.aioeam.service.BookingService;


@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingrepository;


	public Booking getBookingByBookingId(long bookingid) {
	
		return bookingrepository.findById(bookingid).get();
	}


	@Override
	public Booking createbooking(Booking booking) {
		
		return this.bookingrepository.save(booking);
	}

	
	@Override
	public boolean deleteBooking(long bookingid) {
		this.bookingrepository.deleteById(bookingid);
		return true;
	}



	

	

	

	

	

	

	

}
