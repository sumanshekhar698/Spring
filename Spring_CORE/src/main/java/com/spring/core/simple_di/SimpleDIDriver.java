package com.spring.core.simple_di;

import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleDIDriver {

	public static void main(String[] args) {
		System.out.println("START");

// 		We will not use new keyword to directly make objects if one .xml pass it as a
//		ApplicationContext context0 = new ClassPathXmlApplicationContext("config.xml");
//		Every time a context is initialized it will create all the bean

//		It will search the config.xml in the package
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/simple_di/config.xml");

//		It will search the config.xml in root directory of src/main/resources
//		ApplicationContext context2 = new ClassPathXmlApplicationContext(new App().getPath("config.xml"));

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

	String getPath(String file) {
		URL url = this.getClass().getResource(file);
		String absoluteDiskPath = url.getPath();
		System.out.println(absoluteDiskPath);
		return absoluteDiskPath;
	}
}
