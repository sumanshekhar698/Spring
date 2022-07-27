package com.spring.core.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStanaloneCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
		new ClassPathXmlApplicationContext("com/spring/core/standalone_collections/alone_config.xml");
		Person p1 = context.getBean("p1",Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p1.getFeeStructure().getClass());

		
		Person p2 = context.getBean("p2",Person.class);
		System.out.println(p2);
		System.out.println(p2.getFeeStructure().getClass());
//		if ref isNull don't invoke getClass()
	}

}
