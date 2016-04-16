package com.jlearn.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jlearn.spring.annotation.SpringConfig;
import com.jlearn.spring.annotation.bean.Report;

public class AnnotationDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Report report = ctx.getBean(Report.class);
		System.out.println(report);
		ctx.close();
	}

}
