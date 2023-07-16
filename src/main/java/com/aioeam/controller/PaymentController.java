package com.aioeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aioeam.entity.Payment;
import com.aioeam.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService paymentservice;
	
	@PostMapping("/payment")
	public Payment addpayment(@RequestBody Payment payment) {
		return this.paymentservice.addpayment(payment);
	}

}
