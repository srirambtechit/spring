package com.msrm.springframeworks.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.msrm.springframeworks.bean.Address;
import com.msrm.springframeworks.bean.Employee;

public class SpringCoreBasics {

	public static void main(String[] args) {
		normalCreation();

		springCreation();
	}

	/**
	 * Normal way of creating beans. It is a traditional approach
	 */
	static public void normalCreation() {
		Employee e = new Employee();
		e.setId(120121);
		e.setName("Sriram");
		e.setSalary(12500.75f);
		e.setAddress(new Address());
		Address a = e.getAddress();
		a.setId(1000);
		a.setDoorNumber(43);
		a.setStreet("1st cross street");
		a.setArea("Thiruvanmiyur");
		a.setPinCode(600100);
		a.setCity("Chennai");
		a.setCountry("India");

		System.out.println(e);
	}

	/**
	 * Spring container creates bean and serves whenever needed. beans.xml file
	 * contains definition of the beans and its life cycle which used by Spring
	 * container to resolve the dependencies then creates bean
	 */
	@SuppressWarnings("resource")
	public static void springCreation() {
		String path = "D:\\Development\\workspace\\spring-core-demo\\src\\main\\resources\\beans.xml";

		// Loading bean definition from OS file system path
		ApplicationContext ctx = new FileSystemXmlApplicationContext(path);

		Employee employee = ctx.getBean(Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
	}

}
