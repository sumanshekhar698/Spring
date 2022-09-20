package com.spring.core.lifecycle;

//lifecycle using @Annotation
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BreadPakoda {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting price of BreadPakoda via setter");

	}

	@Override
	public String toString() {
		return "BreadPakoda [price=" + price + "]";
	}

	public BreadPakoda() {
		super();
	}

	// for 9+ java have to mention the dependencies
	@PostConstruct
	public void start() {
		System.out.println("INIT  Bread using @Annotations");
	}

	@PreDestroy
	public void end() {
		System.out.println("DESTROY Bread using @Annotations");

	}

}
