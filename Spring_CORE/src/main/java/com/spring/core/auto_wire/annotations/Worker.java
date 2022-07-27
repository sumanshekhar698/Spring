package com.spring.core.auto_wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Worker {
	@Qualifier("current")
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	
//	@Autowired
//	@Qualifier("permanent")//setter gets priority over properties
	public void setAddress(Address address) {
	System.out.println("Setters are used for injection");

		this.address = address;
	}

	@Override
	public String toString() {
		return "Worker [address=" + address + "]";
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	
	public Worker(Address address3) {
		super();
		System.out.println("Parameterized constructor is used for injection");
		this.address = address3;
	}
	
}
