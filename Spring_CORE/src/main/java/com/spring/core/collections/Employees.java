package com.spring.core.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
	private String name;
	private List<String> phones;
	private List<String> pin;
	private List<Integer> tags;
	private Set<String> address;
	private Map<String, String> course;
	private Properties general;

	public Properties getGeneral() {
		return general;
	}

	public void setGeneral(Properties general) {
		this.general = general;
	}

	public List<Integer> getTags() {
		return tags;
	}

	public void setTags(List<Integer> tags) {
		this.tags = tags;
	}

	public List<String> getPin() {
		return pin;
	}

	public void setPin(List<String> pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

}
