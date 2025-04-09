package com.wbtourism.tourapp.services;

import java.util.List;

import com.wbtourism.tourapp.entity.Tour;

public interface ITourService {
    List<Tour> findAll();
    Tour findById(int tourId);
    Tour save(Tour tour);
    String deleteById(int tourId);
    Tour update(Tour tour);
}

