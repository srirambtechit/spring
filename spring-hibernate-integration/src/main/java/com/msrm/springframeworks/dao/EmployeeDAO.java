package com.msrm.springframeworks.dao;

import java.util.List;

import com.msrm.springframeworks.dos.Employee;

public interface EmployeeDAO {

	public void save(Employee e);

	public List<Employee> list();

}