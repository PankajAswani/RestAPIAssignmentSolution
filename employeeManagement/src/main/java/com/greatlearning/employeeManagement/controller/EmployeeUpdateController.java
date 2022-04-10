package com.greatlearning.employeeManagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeUpdateService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeUpdateController {
	@Autowired
	EmployeeUpdateService employeeUpdateService;
	
	@PostMapping("/update")
	Optional<Employee> updateEmployee(@RequestBody Employee employee) {
		return employeeUpdateService.updateEmployee(employee);
	}
}