package com.wbtourism.tourapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wbtourism.tourapp.entity.User;
import com.wbtourism.tourapp.services.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:8185") 
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping(value="test")
	public String testingApi()
	{
		return "Welcome ToSpring Boot  API wbtourism usercontroller";
	}

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }


    @PutMapping("/edit/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id); 
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteById(id);
    }
}
