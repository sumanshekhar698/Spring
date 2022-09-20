package com.spring.core.injecting_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverReference {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/injecting_reference/ref_config.xml");
		A temp = (A) context.getBean("aref1");
		System.out.println(temp.getX());
		System.out.println(temp);
		System.out.println(temp.getObj());
		System.out.println(temp.getObj().getY());
		A temp2 = (A) context.getBean("aref2");
		System.out.println(temp2);
		((ConfigurableApplicationContext) context).close();// to close ==> downcast to Configurable Application context
	}
}
