package com.msrm.springframeworks.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msrm.springframeworks.bean.Movie;

public class BeanCreation {

	public static void main(String[] args) {
		// Loading bean definition from Java classpath
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Movie movieCnstr = ctx.getBean("movieCnstr", Movie.class);
		System.out.println(movieCnstr);

		Movie movieSetter = ctx.getBean("movieSetter", Movie.class);
		System.out.println(movieSetter);

		// Spring always creates Singleton objects when scope not defined, so it
		// returns same object irrespective of number of invocation
		Movie movieSetter2 = ctx.getBean("movieSetter", Movie.class);
		System.out.println(movieSetter2);
		ctx.close();
	}

}
