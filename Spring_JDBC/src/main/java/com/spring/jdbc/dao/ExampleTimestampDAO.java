package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.ExampleTimestamp;
import com.spring.jdbc.entities.Student;

public interface ExampleTimestampDAO {

	public int insert(ExampleTimestamp et);
	public int change(ExampleTimestamp et);
	public int delete(ExampleTimestamp et);
	public Student getSingleStudent(int id);
	public List<Student> getMultipleStudent();

}
