package com.springboot.citestingapp.repository;

import springframework.data.jpa.repository.JpaRepository;
import com.springboot.citestingapp.model.User;

public interface UserRepository extends com.springboot.citestingapp.repository.JpaRepository<User, Long> {
}
