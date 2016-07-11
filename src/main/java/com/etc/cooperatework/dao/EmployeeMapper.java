package com.etc.cooperatework.dao;

import java.util.List;

import com.etc.cooperatework.entity.Employee;

public interface EmployeeMapper {

	int insert(Employee employee);

	List<Employee> findAll();

	int delete(Integer eid);

	int update(Employee employee);

	Employee login_validate(Employee employee);
}