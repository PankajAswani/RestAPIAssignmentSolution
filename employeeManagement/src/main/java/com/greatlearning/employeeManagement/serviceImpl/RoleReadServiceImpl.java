package com.greatlearning.employeeManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.RoleDao;
import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleReadService;

@Service
public class RoleReadServiceImpl implements RoleReadService {
	@Autowired
	RoleDao roleDao;

	@Override
	public Optional<Role> getRoleById(int roleId) {
		return roleDao.findById(roleId);
	}

	@Override
	public List<Role> getAllRoles() {
		return roleDao.findAll();
	}
}