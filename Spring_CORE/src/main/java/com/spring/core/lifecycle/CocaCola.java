package com.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*lifecycle methods using interface
*/public class CocaCola implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Seeting price of coke via setters");
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init code here 
		System.out.println("taking Coke: init via interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy code here
		System.out.println("returning Coke bottle: destroy via interface");

	}
}
