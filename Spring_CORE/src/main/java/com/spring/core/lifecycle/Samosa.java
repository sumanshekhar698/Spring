package com.spring.core.lifecycle;
/*lifecycle methods using xml
*/
public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Samosa via setter");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void hey() {
		System.out.println("INSIDE -> renamed hey :p init() ");
	}
	
	public void destroy() {
		System.out.println("INSIDE -> destroy() ");
	}
}
