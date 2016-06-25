package com.msrm.springframeworks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.msrm.springframeworks.bean.Report;

@Configuration
@ComponentScan(value = "com.jlearn.spring.annotation.bean")
public class SpringConfig {

	@Bean
	public Report getReport() {
		Report report = new Report();
		report.setId(1000);
		report.setName("April Invoice");
		report.setContent("Sales details and its expense details");
		return report;
	}
}
