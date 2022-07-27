package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;

public class AppJavaConfigAutoWired {
	public static void main(String[] args) {
		System.out.println("START of main()");

//		via JAVA config Autowiring
		ApplicationContext context = new AnnotationConfigApplicationContext(AutowiredSpringJDBCJavaConfig.class);
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

		List<Student> students = studentDAO.getMultipleStudent();
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("END of main()");

	}
}
