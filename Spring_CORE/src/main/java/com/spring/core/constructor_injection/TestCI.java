package com.spring.core.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/ci/constructor_injection.xml");
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);

		Addition a1 = (Addition) context.getBean("add");
		a1.doSum();

	}
}
