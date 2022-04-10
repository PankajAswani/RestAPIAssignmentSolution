package com.greatlearning.employeeManagement.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeeManagement.entity.Role;

public interface RoleReadService {
	Optional<Role> getRoleById(int roleId);

	List<Role> getAllRoles();
}