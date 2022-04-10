package com.greatlearning.employeeManagement.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.EmployeeDao;
import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImpl implements EmployeeUpdateService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Optional<Employee> updateEmployee(Employee employee) {
		int employeeId = employee.getEmployeeId();

		if (employeeDao.checkEmployeeExistsById(employeeId)) {
			employeeDao.save(employee);
			return employeeDao.findById(employeeId);
		}

		return null;
	}
}