package com.spring.core.auto_wire.xml;

public class Worker {
	private Address address;

	public Address getAddress() {
		return address;
	}

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

//	public Worker(Address address3) {
	public Worker(Address address) {
		super();
		System.out.println("Parameterized constructor is used for injection");
		this.address = address;
	}

}
