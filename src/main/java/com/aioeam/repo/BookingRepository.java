package com.aioeam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aioeam.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
