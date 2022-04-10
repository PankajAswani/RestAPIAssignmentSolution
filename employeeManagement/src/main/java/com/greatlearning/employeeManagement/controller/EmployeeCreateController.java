package com.greatlearning.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeCreateService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeCreateController {
	@Autowired
	EmployeeCreateService employeeCreateService;

	@PostMapping("/add")
	String addEmployee(@RequestBody Employee employee) {
		return employeeCreateService.addEmployee(employee);
	}
}