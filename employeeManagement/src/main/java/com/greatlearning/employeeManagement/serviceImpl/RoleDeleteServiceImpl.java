package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.RoleDao;
import com.greatlearning.employeeManagement.service.RoleDeleteService;

@Service
public class RoleDeleteServiceImpl implements RoleDeleteService {
	@Autowired
	RoleDao roleDao;

	@Override
	public String deleteRoleById(int roleId) {
		if (roleDao.checkRoleExistsById(roleId)) {
			roleDao.deleteById(roleId);
			return "Deleted role id - " + roleId;
		}

		return "Role with id " + roleId + " not found";
	}
}