package com.spring.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.entities.Student;

@Component("studentDAO")
public class StudentDaoImp1 implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


	
	
	
}
