package com.spring.core.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/reference/refconfig.xml");
		A temp = (A) context.getBean("aref1");
		System.out.println(temp.getX());
		System.out.println(temp);
		System.out.println(temp.getObj());
		System.out.println(temp.getObj().getY());
		A temp2 = (A) context.getBean("aref2");
		System.out.println(temp2);

	}

}
