package com.greatlearning.employeeManagement.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.greatlearning.employeeManagement.dao.EmployeeDao;
import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}

	@Override
	public Optional<Employee> findById(int employeeId) {
		return employeeRepository.findById(employeeId);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void deleteById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public boolean checkEmployeeExistsById(int employeeId) {
		return employeeRepository.existsById(employeeId);
	}

	@Override
	public List<Employee> findByFirstName(String firstName) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("employeeId", "lastName", "emailId");
		Example<Employee> example = Example.of(employee, exampleMatcher);
		return employeeRepository.findAll(example);
	}

	@Override
	public List<Employee> sortByFirstName(Direction direction) {
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}
}