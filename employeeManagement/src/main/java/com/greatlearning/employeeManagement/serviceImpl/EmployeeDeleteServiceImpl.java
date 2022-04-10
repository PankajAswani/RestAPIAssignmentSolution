package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.EmployeeDao;
import com.greatlearning.employeeManagement.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public String deleteEmployeeById(int employeeId) {
		if (employeeDao.checkEmployeeExistsById(employeeId)) {
			employeeDao.deleteById(employeeId);
			return "Deleted employee id - " + employeeId;
		}

		return "Employee with id " + employeeId + " not found";
	}
}