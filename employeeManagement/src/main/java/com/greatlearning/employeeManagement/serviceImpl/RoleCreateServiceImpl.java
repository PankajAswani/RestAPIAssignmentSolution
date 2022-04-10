package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.RoleDao;
import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleCreateService;

@Service
public class RoleCreateServiceImpl implements RoleCreateService {
	@Autowired
	RoleDao roleDao;

	@Override
	public String addRole(Role role) {
		roleDao.save(role);
		return "Role saved successfully";
	}
}