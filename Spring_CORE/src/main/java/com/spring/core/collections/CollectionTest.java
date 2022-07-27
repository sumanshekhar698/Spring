package com.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	public static void main(String[] args) {
		System.out.println("START\n");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/collections/collectionconfig.xml");
//	        	if stored in package use full path for .xml file
		Employees emp1 = (Employees) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPin());
		System.out.println(emp1.getTags());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getPhones().getClass());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());
		System.out.println(emp1.getGeneral());
		System.out.println("END\n");

	}
}
