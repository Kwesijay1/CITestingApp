package com.springboot.citestingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.citestingapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
