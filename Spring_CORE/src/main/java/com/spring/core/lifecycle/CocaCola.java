package com.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*lifecycle methods using interface*/
public class CocaCola implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of coke via setters");
		this.price = price;
	}

	public CocaCola() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CocaCola [price=" + price + "]";
	}

	// init code here
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT taking Coke: init via interface");
	}

	// destroy|cleanup code here
	public void destroy() throws Exception {
		System.out.println("DESTROY returning Coke bottle: destroy via interface");
	}
}
