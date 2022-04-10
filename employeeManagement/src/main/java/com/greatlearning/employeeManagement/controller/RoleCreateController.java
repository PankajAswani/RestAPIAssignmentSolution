package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleCreateService;

@RestController
@RequestMapping("/api/role")
public class RoleCreateController {
	@Autowired
	RoleCreateService roleCreateService;

	@PostMapping("/add")
	String addRole(@RequestBody Role role) {
		return roleCreateService.addRole(role);
	}
}