package com.greatlearning.employeeManagement.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.RoleDao;
import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.service.RoleUpdateService;

@Service
public class RoleUpdateServiceImpl implements RoleUpdateService {
	@Autowired
	RoleDao roleDao;

	@Override
	public Optional<Role> updateRole(Role role) {
		int roleId = role.getRoleId();

		if (roleDao.checkRoleExistsById(roleId)) {
			roleDao.save(role);
			return roleDao.findById(roleId);
		}

		return null;
	}
}