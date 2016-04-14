package com.jlearn.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlearn.spring.bean.Movie;

public class BeanCreation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Loading bean definition from Java classpath
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Movie movieCnstr = ctx.getBean("movieCnstr", Movie.class);
		System.out.println(movieCnstr);

		Movie movieSetter = ctx.getBean("movieSetter", Movie.class);
		System.out.println(movieSetter);

		// Spring always creates Singleton objects when scope not defined, so it
		// returns same object irrespective of number of invocation
		Movie movieSetter2 = ctx.getBean("movieSetter", Movie.class);
		System.out.println(movieSetter2);
	}

}
