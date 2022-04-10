package com.greatlearning.employeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleReadService;

@RestController
@RequestMapping("/api/role")
public class RoleReadController {
	@Autowired
	RoleReadService roleReadService;

	@GetMapping("/search/{roleId}")
	Optional<Role> getRoleById(@PathVariable int roleId) {
		return roleReadService.getRoleById(roleId);
	}

	@GetMapping("/search")
	List<Role> getAllRoles() {
		return roleReadService.getAllRoles();
	}
}