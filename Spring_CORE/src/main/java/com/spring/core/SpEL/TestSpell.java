package com.spring.core.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.core.stereotype.Student;

public class TestSpell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
		new ClassPathXmlApplicationContext("com/spring/core/SpEL/spel_config.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		SpelExpressionParser spell = new SpelExpressionParser();
//		No #{} when using SpelExpressionParser class
		Expression expression = spell.parseExpression("0>=1 ? true:false");
		System.out.println(expression.getValue());		
				
	}

}
