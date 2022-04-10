package com.greatlearning.employeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeReadService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeReadController {
	@Autowired
	EmployeeReadService employeeReadService;

	@GetMapping("/search")
	List<Employee> getAllEmployees() {
		return employeeReadService.getAllEmployees();
	}

	@GetMapping("/search/{employeeId}")
	Optional<Employee> getEmployeeById(@PathVariable int employeeId) {
		return employeeReadService.getEmployeeById(employeeId);
	}

	@GetMapping("/searchby")
	List<Employee> getEmployeeByName(@RequestParam("firstName") String firstName) {
		return employeeReadService.getEmployeesByFirstName(firstName);
	}
	
	@GetMapping("/sort")
	List<Employee> getEmployeesSortByFirstName(@RequestParam("order") String direction) {
		return employeeReadService.getEmployeesSortByFirstName(direction);
	}
}