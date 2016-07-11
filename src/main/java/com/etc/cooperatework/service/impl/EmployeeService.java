package com.etc.cooperatework.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.cooperatework.dao.EmployeeMapper;
import com.etc.cooperatework.entity.Employee;
import com.etc.cooperatework.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Resource
	private EmployeeMapper employeeMapper;

	public void addEmployee(Employee employee) {
		employeeMapper.insert(employee);
	}

	public List<Employee> findAll() {
		return employeeMapper.findAll();
	}

	public void deleteEmployee(Integer eid) {
		employeeMapper.delete(eid);
	}

	public void updateEmployee(Employee employee) {
		employeeMapper.update(employee);
	}

	public Employee doLogin(Employee employee) {
		return employeeMapper.login_validate(employee);
	}

}