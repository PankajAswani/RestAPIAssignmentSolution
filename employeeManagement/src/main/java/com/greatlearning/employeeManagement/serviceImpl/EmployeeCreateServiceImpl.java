package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.EmployeeDao;
import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public String addEmployee(Employee employee) {
		employeeDao.save(employee);
		return "Employee saved successfully";
	}
}