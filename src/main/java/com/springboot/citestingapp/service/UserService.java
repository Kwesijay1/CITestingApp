package com.springboot.citestingapp.service;

import org.springframework.stereotype.Service;
import com.springboot.citestingapp.repository.UserRepository;
import com.springboot.citestingapp.model.User;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll;
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
