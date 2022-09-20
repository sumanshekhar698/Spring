package com.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/config.xml");
		// We used AbstractApplicationContext to invoke destroy() to enable pre-shutdown.

		context.registerShutdownHook();

// 		Registering shutdown hook when you have to destroy object call the hooked-> destroy method()

		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println("_____________________________");
		System.out.println(s1);
		CocaCola c1 = (CocaCola) context.getBean("c1");
		System.out.println(c1);
		BreadPakoda b1 = (BreadPakoda) context.getBean("b1");
		System.out.println(b1);
		System.out.println("_____________________________");

//		The order of destroy for beans may differ but individual order of every beans is setting->init->destroy

		context.close();
	}

}
