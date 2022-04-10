package com.greatlearning.employeeManagement.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeeManagement.entity.User;

public interface UserReadService {
	Optional<User> getUserById(int userId);

	List<User> getAllUsers();
}