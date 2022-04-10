package com.greatlearning.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.employeeManagement.entity.User;
import com.greatlearning.employeeManagement.repository.UserRepository;
import com.greatlearning.employeeManagement.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);

		if (username == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new MyUserDetails(user);
	}
}