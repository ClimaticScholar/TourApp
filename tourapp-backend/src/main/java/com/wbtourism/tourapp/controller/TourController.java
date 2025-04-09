package com.wbtourism.tourapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wbtourism.tourapp.entity.Tour;
import com.wbtourism.tourapp.services.ITourService;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
@CrossOrigin(origins = "http://localhost:3000")
public class TourController {

    @Autowired
    private ITourService tourService;

    @GetMapping
    public List<Tour> getAllTours() {
        return tourService.findAll();
    }

    @GetMapping("/{id}")
    public Tour getTourById(@PathVariable int id) {
        return tourService.findById(id);
    }

    @PostMapping("/create")
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.save(tour);
    }

    @PutMapping("/edit/{id}")
    public Tour updateTour(@PathVariable int id, @RequestBody Tour tour) {
        tour.setId(id);
        return tourService.update(tour);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTour(@PathVariable int id) {
        return tourService.deleteById(id);
    }
}

