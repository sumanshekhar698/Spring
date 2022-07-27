package com.spring.core.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		/*
		 * we will not use new keyword to directly make objects if one .xml pass it as a
		 * 
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		/*
		 * if stored in package use full package path of .xml file; for multiconfig
		 * files -> pass it as a String array: ApplicationContext context = new
		 * ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
		 */
		Student s1 = (Student) context.getBean("student1");// the bean will be of Object type , thus type casted
		System.out.println(s1);
		Student s2 = (Student) context.getBean("student2");
		System.out.println(s2);
		Student s3 = (Student) context.getBean("student3");
		System.out.println(s3);
	}
}
