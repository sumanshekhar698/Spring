package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.dao.StudentDAOImp1;

@Configuration
public class SpringJDBCJavaConfig {

	@Bean("ds")
	public DataSource getDataSource() {

		/*
		 * DriverManagerDataSource extends AbstractDriverBasedDataSource public abstract
		 * class AbstractDriverBasedDataSource extends AbstractDataSource { public
		 * abstract class AbstractDataSource implements DataSource {
		 */
		DriverManagerDataSource ds = new DriverManagerDataSource();

		/*
		 * <property name="driverClassName" value=" com.mysql.cj.jdbc.Driver"/>
		 * <property name="url" value="jdbc:mysql://localhost:3306/springjdbc"/>
		 * <property name="username" value="root"></property> <property name="password"
		 * value="suman"></property>
		 */

		ds.setDriverClassName(" com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("suman");
		return ds;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;

	}

	@Bean("studentDAO")
	public StudentDAO getStudentDao() {
		StudentDAOImp1 studentDAO = new StudentDAOImp1();
		studentDAO.setJdbcTemplate(getTemplate());
		return studentDAO;

	}

}
