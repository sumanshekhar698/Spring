package com.spring.core.constructor_injection;

public class Addition {
	private int a;
	private int b;

/*  
 	*Here ambiguity arises if we have.t define type in .xml
 	*due to ambiguity the top order constructor 
	 matching the parameter is getting executed
	*First priority goes to String irrespective of order
	*Then the order if it doesn't matches
	*
	*/
	
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor : double | double");
		
	}
	
	public Addition(int a, int b) {
		super();
		/*
		 * Spring is so intelligent that it can match the best constructor from the
		 * first explicit type="int only"
		 */
		this.a = a;
		this.b = b;
		System.out.println("constructor : int | int");
		
	}
	
	
	public Addition(String a, String b) {
//		highest priority to String
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor : String | String");
		
	}
	
	public void doSum() {
		System.out.println("a = "+a+" | b = "+b);
		System.out.println("SUM ="+(this.a+this.b));
	}
	
}
