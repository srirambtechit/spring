package com.msrm.springframeworks.app;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msrm.springframeworks.dao.EmployeeDAO;
import com.msrm.springframeworks.dos.Employee;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		Employee employee = new Employee();
		employee.setName("Gopi");
		employee.setSalary(1000.25f);
		employeeDAO.save(employee);
		System.out.println("Employee saved : " + employee);

		List<Employee> list = employeeDAO.list();
		for (Employee e : list) {
			System.out.println("Employee :: " + e);
		}
		context.close();
	}

}
