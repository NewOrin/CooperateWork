package com.etc.cooperatework.service;

import java.util.List;

import com.etc.cooperatework.entity.Employee;

public interface IEmployeeService {

    void addEmployee(Employee employee);

    List<Employee> findAll();

    void deleteEmployee(Integer integer);

    void updateEmployee(Employee employee);

    Employee doLogin(Employee employee);
}
