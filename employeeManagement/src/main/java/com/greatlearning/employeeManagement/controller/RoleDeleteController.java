package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.service.RoleDeleteService;

@RestController
@RequestMapping("/api/role")
public class RoleDeleteController {
	@Autowired
	RoleDeleteService roleDeleteService;

	@DeleteMapping("/delete/{roleId}")
	String deleteRoleById(@PathVariable int roleId) {
		return roleDeleteService.deleteRoleById(roleId);
	}
}