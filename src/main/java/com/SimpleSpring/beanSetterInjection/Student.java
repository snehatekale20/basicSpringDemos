package com.SimpleSpring.beanSetterInjection;

import java.util.List;
import java.util.Map;

public class Student {
	int rollNum;
	String name;
	List<String> Address;
	Map<String,String> add;
	
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public Map<String, String> getAdd() {
		return add;
	}
	public void setAdd(Map<String, String> add) {
		this.add = add;
	}
	
	public void show() {
		System.out.println("RollNum : "+rollNum);
		System.out.println("Name : "+name);
		System.out.println("Address using set ...");
		Address.stream().forEach(a->System.out.println(a));
		System.out.println("address using map....");
		System.out.println(add);
		
	}
	

}
