package com.greatlearning.employeeManagement.service;

import java.util.Optional;

import com.greatlearning.employeeManagement.entity.User;

public interface UserUpdateService {
	Optional<User> updateUser(User user);
}