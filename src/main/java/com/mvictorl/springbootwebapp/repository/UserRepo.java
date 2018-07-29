package com.mvictorl.springbootwebapp.repository;

import com.mvictorl.springbootwebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
