package com.aioeam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	private String hotelname;
	private String hoteladdress;
	private String contactno;
	private double acprice;
	private double nonacprice;
	private Availability status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public double getAcprice() {
		return acprice;
	}
	public void setAcprice(double acprice) {
		this.acprice = acprice;
	}
	public double getNonacprice() {
		return nonacprice;
	}
	public void setNonacprice(double nonacprice) {
		this.nonacprice = nonacprice;
	}
	public Availability getStatus() {
		return status;
	}
	public void setStatus(Availability status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelname=" + hotelname + ", hoteladdress=" + hoteladdress + ", contactno="
				+ contactno + ", acprice=" + acprice + ", nonacprice=" + nonacprice + ", status=" + status + "]";
	}
	public Hotel(int id, String hotelname, String hoteladdress, String contactno, double acprice, double nonacprice,
			Availability status) {
		super();
		this.id = id;
		this.hotelname = hotelname;
		this.hoteladdress = hoteladdress;
		this.contactno = contactno;
		this.acprice = acprice;
		this.nonacprice = nonacprice;
		this.status = status;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}