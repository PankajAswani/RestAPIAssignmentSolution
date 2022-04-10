package com.greatlearning.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeeManagement.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}