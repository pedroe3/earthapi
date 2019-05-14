package com.sadcrow.earthquake.controller;


import com.sadcrow.earthquake.entities.User;
import com.sadcrow.earthquake.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("/")
    public User createUser(){
        User user = new User();
        user.setName("Pedrito");
        user.setSalary(10000L);
        userRepository.save(user);

        return user;
    }
}
