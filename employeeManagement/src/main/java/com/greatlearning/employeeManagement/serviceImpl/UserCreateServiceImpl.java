package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManagement.dao.UserDao;
import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.service.UserCreateService;

@Service
public class UserCreateServiceImpl implements UserCreateService {
	@Autowired
	UserDao userDao;

	@Override
	public String addUser(User user) {
		userDao.save(user);
		return "User saved successfully";
	}
}