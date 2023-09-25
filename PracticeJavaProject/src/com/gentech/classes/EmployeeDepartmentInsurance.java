package com.gentech.classes;

class Employee
{
	String FirstName;
	int age;
	int id;
	String Worktype;
}  

class Department
{
	String DepartName;
	int id;
	String Location;
	int pincode;
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
}

public class EmployeeDepartmentInsurance {

	public static void main(String[] args) {

		Employee ravi= new Employee();
		ravi.FirstName="Manju";
		ravi.age=21;
		ravi.id=5115;
		ravi.Worktype="Developer";
		System.out.println("FirstName:"+ravi.FirstName);
		System.out.println("Age:"+ravi.age);
		System.out.println("id:"+ravi.id);
		System.out.println("worktype:"+ravi.Worktype);
		System.out.println("----------------------");

		Department branch=new Department();
		branch.DepartName="IT ";
		branch.id=1099;
		branch.Location="Bangalore";
		branch.pincode=584728;
		System.out.println("DepartName:"+branch.DepartName);
		System.out.println("id:"+branch.id);
		System.out.println("Location:"+branch.Location);
		System.out.println("pincode:"+branch.pincode);
		System.out.println("-----------------------");

		Insurence Life= new Insurence();
		Life.InsurenceName="LIC";
		Life.InsurenceType="Health Insurence";
		Life.CustomerName="Rahul";
		Life.id=8988;
		System.out.println("InsurenceName:"+Life.InsurenceName);
		System.out.println("InsurenceType:"+Life.InsurenceType);
		System.out.println("CustomerName:"+Life.CustomerName);
		System.out.println("id:"+Life.id);
	}

}











