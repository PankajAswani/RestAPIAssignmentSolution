package com.greatlearning.employeeManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.UserDao;
import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserReadService;

@Service
public class UserReadServiceImpl implements UserReadService {
	@Autowired
	UserDao userDao;
	
	@Override
	public Optional<User> getUserById(int userId) {
		return userDao.findById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}
}