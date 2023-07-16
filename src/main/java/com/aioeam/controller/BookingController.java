package com.aioeam.controller;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aioeam.entity.Availability;
import com.aioeam.entity.Booking;
import com.aioeam.entity.BookingRequest;
import com.aioeam.entity.Customers;
import com.aioeam.entity.Hotel;
import com.aioeam.entity.UserInfo;
import com.aioeam.service.BookingService;
import com.aioeam.service.HotelService;
import com.aioeam.service.UserService;

@RestController
public class BookingController {

	@Autowired
	private HotelService hotelservice;

	@Autowired
	private UserService userservice;

	@Autowired
	private BookingService bookingservice;

	@PostMapping("/createBooking")
	public Booking createbooking(@RequestBody BookingRequest bookingrequest) {

		UserInfo userinfo = userservice.getinfo(bookingrequest.getUserid());
		List<Customers> customers = bookingrequest.getCustomers();
		Hotel hotel = hotelservice.getHotelById(bookingrequest.getHotelid());
		LocalDate checkin = bookingrequest.getCheckin();
		LocalDate checkout = bookingrequest.getCheckout();
		int rooms = bookingrequest.getRooms();

		Booking booking = new Booking();
		booking.setUserinfo(userinfo);
		booking.setHotel(hotel);
		booking.setCustomers(customers);
		booking.setCheckin(checkin);
		booking.setCheckout(checkout);
		booking.setRooms(rooms);

		return bookingservice.createbooking(booking);
	}

	@GetMapping("/GetBookingByBoookingID/{bookingid}")
	public Booking getBookingByBookingId(@PathVariable long bookingid) {
				
		return this.bookingservice.getBookingByBookingId(bookingid);
		

	}

	@DeleteMapping("/deleteBookingByBookingId/{bookingid}")
	public ResponseEntity<String> deleteBookingById(@PathVariable long bookingid) {
		this.bookingservice.deleteBooking(bookingid);
		return ResponseEntity.ok("Successfully Deleted of ID : " + bookingid);
	}

}
