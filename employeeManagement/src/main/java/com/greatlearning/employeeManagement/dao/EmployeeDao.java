package com.greatlearning.employeeManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employeeManagement.entity.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	Optional<Employee> findById(int employeeId);

	List<Employee> findAll();

	void deleteById(int employeeId);
	
	boolean checkEmployeeExistsById(int employeeId);
	
	List<Employee> findByFirstName(String firstName);
	
	List<Employee> sortByFirstName(Direction direction);
}