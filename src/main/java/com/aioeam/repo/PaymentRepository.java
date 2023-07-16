package com.aioeam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aioeam.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String>{

}
