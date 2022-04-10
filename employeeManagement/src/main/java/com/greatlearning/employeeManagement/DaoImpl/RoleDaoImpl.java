package com.greatlearning.employeeManagement.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.employeeManagement.dao.RoleDao;
import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.repository.RoleRepository;

@Component
public class RoleDaoImpl implements RoleDao {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void save(Role role) {
		roleRepository.saveAndFlush(role);
	}

	@Override
	public Optional<Role> findById(int roleId) {
		return roleRepository.findById(roleId);
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public void deleteById(int roleId) {
		roleRepository.deleteById(roleId);

	}

	@Override
	public boolean checkRoleExistsById(int roleId) {
		return roleRepository.existsById(roleId);
	}
}