package com.msrm.springframeworks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msrm.springframeworks.bean.Student;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student student = ctx.getBean("studentBean", Student.class);
		System.out.println(student);
		ctx.close();
	}

}
