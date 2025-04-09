package com.wbtourism.tourapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wbtourism.tourapp.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
