package com.aioeam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aioeam.entity.Payment;
import com.aioeam.repo.PaymentRepository;
import com.aioeam.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	 @Autowired
	 private PaymentRepository paymentrepo;
	 
	public Payment addpayment(Payment payment) {
		// TODO Auto-generated method stub
		return this.paymentrepo.save(payment);
	}
	
	

}
