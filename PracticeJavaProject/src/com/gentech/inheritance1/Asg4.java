package com.gentech.inheritance1;
class Employee4a 
{
	String name;

	void showEmployeeName(String name) 
	{
		System.out.println("Employee name: " + name);
	}
}

class Employee14a extends Employee4a 
{
	String company;

	Employee14a(String name, String company) 
	{
		super.name = name;
		this.company = company;
	}

	void showEmployeeInfo() 
	{
		System.out.println("Employee name: " + name);
		System.out.println("Company: " + company);
	}
}

class Employee24a extends Employee14a 
{
	Employee24a(String name, String company) 
	{
		super(name, company);
	}

	void showLocation(String location) 
	{
		System.out.println("Location: " + location);
	}
}

public class Asg4 {
	public static void main(String[] args) {
		Employee24a obj = new Employee24a("Rahul", "Tata");
		obj.showEmployeeInfo();
		obj.showLocation("Bangalore");
	}
}


