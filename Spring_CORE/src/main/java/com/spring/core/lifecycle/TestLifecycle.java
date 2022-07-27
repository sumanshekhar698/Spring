package com.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/config.xml");
		// to invoke destroy() we have to enable pre-shutdown.
		context.registerShutdownHook();
		/* Registering shutdown hook
		 * when you have to destroy object call the hooked-> destroy method()
		 */
		
		
		
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
	
		
		
		System.out.println("_____________________________");
		CocaCola c1 = (CocaCola) context.getBean("c1");
		System.out.println(c1);
		
		/*
		 * the order of many beans may differ but individual order of every beans
		 * setting->init->destroy
		 */
		
		System.out.println("_____________________________");
		BreadPakoda b1 = (BreadPakoda) context.getBean("b1");
		System.out.println(b1);
		
	}

}
