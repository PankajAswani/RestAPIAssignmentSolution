package com.greatlearning.employeeManagement.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.UserDao;
import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserUpdateService;

@Service
public class UserUpdateServiceImpl implements UserUpdateService {
	@Autowired
	UserDao userDao;

	@Override
	public Optional<User> updateUser(User user) {
		int userId = user.getUserId();

		if (userDao.checkUserExistsById(userId)) {
			userDao.save(user);
			return userDao.findById(userId);
		}

		return null;
	}
}