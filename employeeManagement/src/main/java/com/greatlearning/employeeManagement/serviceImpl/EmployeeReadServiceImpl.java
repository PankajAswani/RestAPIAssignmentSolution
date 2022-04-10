package com.greatlearning.employeeManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.EmployeeDao;
import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeReadService;

@Service
public class EmployeeReadServiceImpl implements EmployeeReadService {
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Optional<Employee> getEmployeeById(int employeeId) {
		return employeeDao.findById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public List<Employee> getEmployeesByFirstName(String firstName) {
		return employeeDao.findByFirstName(firstName);
	}

	@Override
	public List<Employee> getEmployeesSortByFirstName(String direction) {
		if ("asc".equalsIgnoreCase(direction)) {
			return employeeDao.sortByFirstName(Sort.Direction.ASC);
		}
		
		return employeeDao.sortByFirstName(Sort.Direction.DESC);
	}
}