package com.spring.core.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/constructor_injection/ci_config.xml");
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		System.out.println(p1);
		System.out.println(p2);

		// Ambiguity Issue
		Addition a1 = (Addition) context.getBean("add");
		a1.doSum();
	}
}