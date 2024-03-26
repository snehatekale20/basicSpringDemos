package com.SimpleSpring.beanconstructorInjection;

import java.util.List;
import java.util.Map;

public class StudConstructor {
	
	int rollNum;
	String name;
	List<String> Address;
	Map<String,String> add;
	
	public StudConstructor(int rollNum, String name, List<String> address, Map<String, String> add) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		Address = address;
		this.add = add;
	}
	
	public void print() {
		System.out.println("Emp_Id : "+rollNum);
		System.out.println("Emp_name : "+name);
		System.out.println("address using list :");
		Address.stream().forEach(d->System.out.println(d));
		System.out.println("add using map : ");
		System.out.println(add);
	}

}
