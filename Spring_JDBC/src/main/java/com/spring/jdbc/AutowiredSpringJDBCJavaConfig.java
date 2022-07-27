package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
/*
 * Spring Container will scan the below package and return the @Component bean
 * when asked
 */
@ComponentScan(basePackages = { "com.spring.jdbc.dao" })
public class AutowiredSpringJDBCJavaConfig {

	/*
	 * the below beans are required as it will be used to satisfy the dependency for
	 * the StudentDAOImp1
	 */
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

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
