package com.wbtourism.tourapp.services;

import java.util.List;

import com.wbtourism.tourapp.entity.User;

public interface IUserService {
    List<User> findAll();
    //User registerUser(User user);
    User findById(int userId);
    User registerUser(User user);
    String deleteById(int userId);
    User update(User user);
}
