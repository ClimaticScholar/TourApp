package com.wbtourism.tourapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wbtourism.tourapp.entity.Booking;
import com.wbtourism.tourapp.repository.BookingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements IBookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking findById(int bookingId) {
        Optional<Booking> result = bookingRepository.findById(bookingId);
        return result.orElseThrow(() -> new RuntimeException("Booking not found with ID: " + bookingId));
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public String deleteById(int bookingId) {
        Optional<Booking> result = bookingRepository.findById(bookingId);
        if (result.isPresent()) {
            bookingRepository.delete(result.get());
            return "Booking with ID " + bookingId + " deleted successfully";
        }
        return "Booking with ID " + bookingId + " not found";
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }
}
