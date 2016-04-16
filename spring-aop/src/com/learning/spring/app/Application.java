package com.learning.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.business.Calculator;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Calculator calc = ctx.getBean("calculatorBean", Calculator.class);
		System.out.println(calc.add(8, 3));
		System.out.println(calc.sub(8, 3));
		System.out.println(calc.mul(8, 3));
		System.out.println(calc.div(8, 3));
		ctx.close();
	}

}
