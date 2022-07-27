package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="student")// Table name change
public class Student {

	@Id
	@Column(name = "studentID")
	private int studentID;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "studentCity")
	private String studentCity;
	
	
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentCity() {
		return studentCity;
	}
	
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	
	public Student(int studentID, String studentName, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}
