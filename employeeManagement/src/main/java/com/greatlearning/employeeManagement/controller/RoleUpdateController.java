package com.greatlearning.employeeManagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleUpdateService;

@RestController
@RequestMapping("/api/role")
public class RoleUpdateController {
	@Autowired
	RoleUpdateService roleUpdateService;

	@PostMapping("/update")
	Optional<Role> updateRole(@RequestBody Role role) {
		return roleUpdateService.updateRole(role);
	}
}