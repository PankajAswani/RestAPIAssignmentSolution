package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserCreateService;

@RestController
@RequestMapping("/api/user")
public class UserCreateController {
	@Autowired
	UserCreateService userCreateService;

	@PostMapping("/add")
	String addUser(@RequestBody User user) {
		return userCreateService.addUser(user);
	}
}