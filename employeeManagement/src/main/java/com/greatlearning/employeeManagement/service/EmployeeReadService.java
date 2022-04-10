package com.greatlearning.employeeManagement.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeeManagement.entity.Employee;

public interface EmployeeReadService {
	Optional<Employee> getEmployeeById(int employeeId);

	List<Employee> getAllEmployees();
	
	List<Employee> getEmployeesByFirstName(String firstName);
	
	List<Employee> getEmployeesSortByFirstName(String direction);
}