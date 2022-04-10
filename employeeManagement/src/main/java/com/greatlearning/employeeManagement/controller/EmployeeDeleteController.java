package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.service.EmployeeDeleteService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeDeleteController {
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	
	@DeleteMapping("/delete/{employeeId}")
	String deleteEmployeeById(@PathVariable int employeeId) {
		return employeeDeleteService.deleteEmployeeById(employeeId);
	}
}