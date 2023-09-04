package com.spring.boot.app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.spring.boot.app.entity.User;

@Service
public interface UserRepository extends JpaRepository<User, Long> {

	
}
