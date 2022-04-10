package com.greatlearning.employeeManagement.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.employeeManagement.dao.UserDao;
import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.repository.UserRepository;

@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.saveAndFlush(user);
	}

	@Override
	public Optional<User> findById(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public boolean checkUserExistsById(int userId) {
		return userRepository.existsById(userId);
	}
}
