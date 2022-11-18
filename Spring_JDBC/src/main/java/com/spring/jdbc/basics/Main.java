package com.spring.jdbc.basics;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;

public class Main {

	public static void main(String[] args) {
		System.out.println("START <<");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/jdbc/basics/jdbc_config.xml");
		StudentDAOImpl dao = context.getBean("studentDAO", StudentDAOImpl.class);

		// Select All
		/*
		 * List<Student> multipleStudent = dao.getMultipleStudent();
		 * 
		 * for (Student student : multipleStudent) { System.out.println(student); }
		 */

		int sId = 10;
		// Select Single
		try {
			Student singleStudent = dao.getSingleStudent(sId);
			System.out.println(singleStudent);

		} catch (EmptyResultDataAccessException e) {
			System.out.println(e);
			System.out.println(sId + " Not present");
		} catch (Exception e) {
			System.out.println(e);
		}

		// DELETE
		int delete = dao.delete(5);
		System.out.println("DELETED ==> " + delete);

//		UPDATE
		int change = dao.change(new Student(10, "Balwinder", "NY"));
		System.out.println("UPDATED ==> " + change);

//		CREATE

		try {
			int created = dao.insert(new Student(100, "Sourabh", "Miami"));
			System.out.println("CREATED ==> " + created);
		} catch (DuplicateKeyException e) {
			System.out.println(e);
			System.out.println(sId + " Not present");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("END >>");
	}
}
