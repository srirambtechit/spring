package com.msrm.springframeworks.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msrm.springframeworks.SpringConfig;
import com.msrm.springframeworks.bean.Report;

public class AnnotationDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Report report = ctx.getBean(Report.class);
		System.out.println(report);
		ctx.close();
	}

}
