package com.msrm.springframeworks.app;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msrm.springframeworks.dao.StudentDAO;
import com.msrm.springframeworks.dos.Student;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		StudentDAO studentDAO = ctx.getBean("studentDAO", StudentDAO.class);

		// Inserting a new record
		Student student = new Student(0, "Vinoth", "Salem", "vin@gmail.com");
//		System.out.println("Insert new record");
//		studentDAO.save(student);

		System.out.println("Update record");
		// pass student record id to perform update
		student.setId(1);
		student.setAddress("Chennai");
		studentDAO.update(student);

		List<Student> students = studentDAO.fetchStudent();
		if (students != null) {
			for (Student s : students) {
				System.out.println(s);
			}
		}

		ctx.close();

	}

}
