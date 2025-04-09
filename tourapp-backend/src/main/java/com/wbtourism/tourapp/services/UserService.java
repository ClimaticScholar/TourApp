package com.wbtourism.tourapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wbtourism.tourapp.entity.User;
import com.wbtourism.tourapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepositorydao;

    @Override
    public List<User> findAll() {
        return userRepositorydao.findAll();
    }

    @Override
    public User findById(int userId) {
//        Optional<User> result = userRepositorydao.findById(userId);
//        return result.orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
    	Optional<User> result = userRepositorydao.findById(userId);
    	User user= null;
		
		if (result.isPresent()) {
			user = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find user id - " + userId);
		}
		
		return user;
    }

    @Override
    public User registerUser(User user) {
        return userRepositorydao.save(user);
    }

    @Override
    public String deleteById(int userId) {
        Optional<User> result = userRepositorydao.findById(userId);
        if (result.isPresent()) {
            userRepositorydao.delete(result.get());
            return "User with ID " + userId + " deleted successfully";
        }
        return "User with ID " + userId + " not found";
    }

    @Override
    public User update(User user) {
        return userRepositorydao.save(user);
    }
}

