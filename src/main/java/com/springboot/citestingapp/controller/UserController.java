package com.springboot.citestingapp.controller;

import org.springframework.web.bind.annotation.*;
import com.springboot.citestingapp.service.UserService;
import com.springboot.citestingapp.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}

