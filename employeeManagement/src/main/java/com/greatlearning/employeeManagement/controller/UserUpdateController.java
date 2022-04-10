package com.greatlearning.employeeManagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserUpdateService;

@RestController
@RequestMapping("/api/user")
public class UserUpdateController {
	@Autowired
	UserUpdateService userUpdateService;

	@PostMapping("/update")
	Optional<User> updateUser(@RequestBody User user) {
		return userUpdateService.updateUser(user);
	}
}