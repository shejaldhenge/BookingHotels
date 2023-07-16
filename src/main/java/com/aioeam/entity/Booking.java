package com.aioeam.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long bookingid;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserInfo userinfo;

	    @ManyToOne
	    @JoinColumn(name = "hotel_id")
	    private Hotel hotel;
	    
	   
		@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
	    private List<Customers> customers;

		 private LocalDate checkin;
		    
		 private LocalDate checkout;
		    
		 private int rooms;

		public long getBookingid() {
			return bookingid;
		}

		public void setBookingid(long bookingid) {
			this.bookingid = bookingid;
		}

		public UserInfo getUserinfo() {
			return userinfo;
		}

		public void setUserinfo(UserInfo userinfo) {
			this.userinfo = userinfo;
		}

		public Hotel getHotel() {
			return hotel;
		}

		public void setHotel(Hotel hotel) {
			this.hotel = hotel;
		}

		public List<Customers> getCustomers() {
			return customers;
		}

		public void setCustomers(List<Customers> customers) {
			this.customers = customers;
		}

		public LocalDate getCheckin() {
			return checkin;
		}

		public void setCheckin(LocalDate checkin) {
			this.checkin = checkin;
		}

		public LocalDate getCheckout() {
			return checkout;
		}

		public void setCheckout(LocalDate checkout) {
			this.checkout = checkout;
		}

		public int getRooms() {
			return rooms;
		}

		public void setRooms(int rooms) {
			this.rooms = rooms;
		}

		@Override
		public String toString() {
			return "Booking [bookingid=" + bookingid + ", userinfo=" + userinfo + ", hotel=" + hotel + ", customers="
					+ customers + ", checkin=" + checkin + ", checkout=" + checkout + ", rooms=" + rooms + "]";
		}

		public Booking(long bookingid, UserInfo userinfo, Hotel hotel, List<Customers> customers, LocalDate checkin,
				LocalDate checkout, int rooms) {
			super();
			this.bookingid = bookingid;
			this.userinfo = userinfo;
			this.hotel = hotel;
			this.customers = customers;
			this.checkin = checkin;
			this.checkout = checkout;
			this.rooms = rooms;
		}

		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}

		 
	
	
}
