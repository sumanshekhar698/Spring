package com.spring.core.constructor_injection.parent_attribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		Resource r = new ClassPathResource("config_ci2.xml");
//		BeanFactory factory = new XmlBeanFactory(r);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/constructor_injection/parent_attribute/config_ci2.xml");
		Employee e2 = (Employee) context.getBean("e2");

//		Employee e1 = (Employee) factory.getBean("e2");
		e2.show();

	}
}