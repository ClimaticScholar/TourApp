package com.wbtourism.tourapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wbtourism.tourapp.entity.Tour;


public interface TourRepository extends JpaRepository<Tour, Integer>{

}
