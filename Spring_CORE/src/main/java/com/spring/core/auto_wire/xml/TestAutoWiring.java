package com.spring.core.auto_wire.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/auto_wire/xml/auto_config.xml");
//		to skip type-casting
		Worker w1 = context.getBean("w1", Worker.class);
		System.out.println(w1);


	}

}
