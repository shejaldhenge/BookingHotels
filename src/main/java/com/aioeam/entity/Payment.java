package com.aioeam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private String cardnumber;
	private String cardholdername;
	private String expdate;
	private String cvv;
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Payment [cardnumber=" + cardnumber + ", cardholdername=" + cardholdername + ", expdate=" + expdate
				+ ", cvv=" + cvv + "]";
	}
	public Payment(String cardnumber, String cardholdername, String expdate, String cvv) {
		super();
		this.cardnumber = cardnumber;
		this.cardholdername = cardholdername;
		this.expdate = expdate;
		this.cvv = cvv;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	

}
