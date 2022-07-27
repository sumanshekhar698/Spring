package com.spring.core.standalone_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties props;


	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFriends() {
		return friends;
	}


@Override
	public String toString() {
		return "Person [friends=" + friends + ",\nfeeStructure=" + feeStructure + "]\n"+"Properties ->"+props+"\n";
	}

	//	we will use setter injection
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	
}
