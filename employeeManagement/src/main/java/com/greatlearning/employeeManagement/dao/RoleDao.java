package com.greatlearning.employeeManagement.dao;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeeManagement.entity.Role;

public interface RoleDao {
	void save(Role role);

	Optional<Role> findById(int roleId);

	List<Role> findAll();

	void deleteById(int roleId);

	boolean checkRoleExistsById(int roleId);
}