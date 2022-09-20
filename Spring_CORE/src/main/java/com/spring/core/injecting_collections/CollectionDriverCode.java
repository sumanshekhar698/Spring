package com.spring.core.injecting_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDriverCode {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("START");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/injecting_collections/collection_config.xml");

		Employees emp1 = (Employees) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPin());
		System.out.println(emp1.getTags());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getPhones().getClass());// class java.util.ArrayList by default
		System.out.println(emp1.getPhones().getClass().getName());// java.util.ArrayList
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());
		System.out.println(emp1.getGeneral());
		System.out.println("END\n");

	}
}
