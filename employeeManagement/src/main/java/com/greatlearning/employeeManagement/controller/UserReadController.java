package com.greatlearning.employeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserReadService;

@RestController
@RequestMapping("/api/user")
public class UserReadController {
	@Autowired
	UserReadService userReadService;

	@GetMapping("/search/{userId}")
	Optional<User> getUserById(@PathVariable int userId) {
		return userReadService.getUserById(userId);
	}

	@GetMapping("/search")
	List<User> getAllUsers() {
		return userReadService.getAllUsers();
	}
}