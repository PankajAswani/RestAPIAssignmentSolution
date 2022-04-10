package com.greatlearning.employeeManagement.service;

import java.util.Optional;

import com.greatlearning.employeeManagement.entity.Employee;

public interface EmployeeUpdateService {
	Optional<Employee> updateEmployee(Employee employee);
}