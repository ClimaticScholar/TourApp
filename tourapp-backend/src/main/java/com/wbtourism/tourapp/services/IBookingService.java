package com.wbtourism.tourapp.services;

import java.util.List;

import com.wbtourism.tourapp.entity.Booking;

public interface IBookingService {
    List<Booking> findAll();
    Booking findById(int bookingId);
    Booking save(Booking booking);
    String deleteById(int bookingId);
    Booking update(Booking booking);
}
