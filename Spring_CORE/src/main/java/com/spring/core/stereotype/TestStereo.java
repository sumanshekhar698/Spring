package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.standalone_collections.Person;

public class TestStereo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/core/stereotype/stereo_config.xml");
				Student s1 = context.getBean("s1",Student.class);
				System.out.println(s1);
				System.out.println(s1.getCourses().getClass());
				System.out.println(s1.hashCode());
				System.out.println("\n______________________________________________\n");
				Student s2 = context.getBean("s1",Student.class);
				System.out.println(s2);
				System.out.println(s2.hashCode());

				Teacher t1 = context.getBean("teacher",Teacher.class);
				Teacher t2 = context.getBean("teacher",Teacher.class);
				System.out.println("\nTeacher prototype Scope \n______________________________________________");

				System.out.println(t1.hashCode());
				System.out.println(t2.hashCode());

				
				
				
	}

}
