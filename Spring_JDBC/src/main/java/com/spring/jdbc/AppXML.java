package com.spring.jdbc;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.util.StringUtils;
import com.spring.jdbc.entities.ExampleTimestamp;

public class AppXML {
	public static void main(String[] args) {
		System.out.println("START of main()");

//		via XML
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//		INSERT Query
		String query1 = "INSERT INTO STUDENT(ID,NAME,CITY) VALUES(?,?,?)";

		int updated = template.update(query1, 04, "Malay", "Mysore");// fire query
		System.out.println("ROWS UPDATED : " + updated);
		System.out.println("END of main()");

//		INSERT Query
		ExampleTimestamp et = new ExampleTimestamp();
		System.out.println("The data is => " + et.getData());
		et.setData("sysdate time is");
		System.out.println("CHECK => " + StringUtils.isEmptyOrWhitespaceOnly(null));

//		String query2 = "INSERT INTO example_timestamp (DATA,CUR_TIMESTAMP) VALUES(?,?)";
//		// fire query
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("TIMESTAMP" + timestamp);
		et.setCur_timestamp(timestamp);
//		int updated = template.update(query2, et.getData(), timestamp);

		String query3 = "INSERT INTO example_timestamp (DATA,CUR_TIMESTAMP) VALUES(?,CURRENT_TIMESTAMP(5))";
		final Map<Integer, Object> params = new HashMap<Integer, Object>();

		params.put(1, "the current time is");
//		params.put(3, et.getCur_timestamp());

//		for (Integer key : params.keySet()) {
//			System.out.println(key + " " + params.get(key));
//			ps.setObject(index, params.get(index));
//		}

		updated = template.update(query3, (PreparedStatement ps) -> {
			for (Integer index : params.keySet()) {
				System.out.println(index + " " + params.get(index));
				ps.setObject(index, params.get(index));
			}
		});

		System.out.println("ROWS UPDATED : " + updated);
		System.out.println("END of main()");
	}
}
