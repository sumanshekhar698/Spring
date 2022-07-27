package com.spring.core.constructor_injection;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Certi certi;
	private List<String> listOfCourses;
	
	public Person(String name, int age,Certi certi,List<String> listOfCourses) {
		
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
		this.listOfCourses = listOfCourses;
		System.out.println("Person constructor called");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certi=" + certi + ", listOfCourses=" + listOfCourses + "]";
	}

	


	
	
	
}
