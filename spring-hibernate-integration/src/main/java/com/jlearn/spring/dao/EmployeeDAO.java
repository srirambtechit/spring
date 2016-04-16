package com.jlearn.spring.dao;

import java.util.List;

import com.jlearn.spring.dos.Employee;

public interface EmployeeDAO {

	public void save(Employee e);

	public List<Employee> list();

}