package com.learning.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.bean.Student;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student student = ctx.getBean("studentBean", Student.class);
		System.out.println(student);
		ctx.close();
	}

}
