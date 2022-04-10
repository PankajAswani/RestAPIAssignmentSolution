package com.greatlearning.employeeManagement.dao;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeeManagement.entity.User;

public interface UserDao {
	void save(User user);

	Optional<User> findById(int userId);

	List<User> findAll();

	void deleteById(int userId);

	boolean checkUserExistsById(int userId);
}