package com.greatlearning.employeeManagement.service;

import java.util.Optional;

import com.greatlearning.employeeManagement.entity.Role;

public interface RoleUpdateService {
	Optional<Role> updateRole(Role role);
}