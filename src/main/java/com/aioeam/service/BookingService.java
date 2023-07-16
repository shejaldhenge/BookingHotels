package com.aioeam.service;

import com.aioeam.entity.Booking;

public interface BookingService {
	
	public Booking createbooking(Booking booking);
	
	public Booking getBookingByBookingId(long bookingid);
	
	public boolean deleteBooking(long bookingid);
	
}
