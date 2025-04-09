package com.wbtourism.tourapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wbtourism.tourapp.entity.Booking;
import com.wbtourism.tourapp.services.IBookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private  IBookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.findAll();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable int id) {
        return bookingService.findById(id);
    }

    @PostMapping("/create")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    @PutMapping("/edit/{id}")
    public Booking updateBooking(@PathVariable int id, @RequestBody Booking booking) {
        booking.setId(id);
        return bookingService.update(booking);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable int id) {
        return bookingService.deleteById(id);
    }
}
