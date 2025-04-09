package com.wbtourism.tourapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wbtourism.tourapp.entity.Tour;
import com.wbtourism.tourapp.repository.TourRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TourService implements ITourService {

    @Autowired
    private TourRepository tourRepository;

    @Override
    public List<Tour> findAll() {
        return tourRepository.findAll();
    }

    @Override
    public Tour findById(int tourId) {
        Optional<Tour> result = tourRepository.findById(tourId);
        return result.orElseThrow(() -> new RuntimeException("Tour not found with ID: " + tourId));
    }

    @Override
    public Tour save(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public String deleteById(int tourId) {
        Optional<Tour> result = tourRepository.findById(tourId);
        if (result.isPresent()) {
            tourRepository.delete(result.get());
            return "Tour with ID " + tourId + " deleted successfully";
        }
        return "Tour with ID " + tourId + " not found";
    }

    @Override
    public Tour update(Tour tour) {
        return tourRepository.save(tour);
    }
}
