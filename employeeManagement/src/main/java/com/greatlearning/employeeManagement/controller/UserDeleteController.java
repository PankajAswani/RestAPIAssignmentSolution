package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.service.UserDeleteService;

@RestController
@RequestMapping("/api/user")
public class UserDeleteController {
	@Autowired
	UserDeleteService userDeleteService;

	@DeleteMapping("/delete/{userId}")
	String deleteUserById(@PathVariable int userId) {
		return userDeleteService.deleteUserById(userId);
	}
}