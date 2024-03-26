package com.SimpleSpring.beanconstructorInjection;

public class EmpConstructor {
	private int empId;
	private String empName;
	private String empEmail;
	
	
	public EmpConstructor(int empId, String empName, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}
	
	public void show() {
		System.out.println("Emp_Id : "+empId);
		System.out.println("Emp_name : "+empName);
		System.out.println("Emp_email : "+empEmail);
	}

}
