package com.wbtourism.tourapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wbtourism.tourapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
