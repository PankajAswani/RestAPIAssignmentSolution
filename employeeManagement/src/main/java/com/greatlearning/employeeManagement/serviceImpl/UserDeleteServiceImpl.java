package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.UserDao;
import com.greatlearning.employeeManagement.service.UserDeleteService;

@Service
public class UserDeleteServiceImpl implements UserDeleteService {
	@Autowired
	UserDao userDao;

	@Override
	public String deleteUserById(int userId) {
		if (userDao.checkUserExistsById(userId)) {
			userDao.deleteById(userId);
			return "Deleted user id - " + userId;
		}

		return "User with id " + userId + " not found";
	}
}