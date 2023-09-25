package com.gentech.noargsconstructor;



class Employee
{
	String FirstName;
	int age;
	int id;
	String Worktype;
	{

		FirstName="Manju";
		age=21;
		id=5115;
		Worktype="Developer";
		System.out.println("FirstName:"+FirstName);
		System.out.println("Age:"+age);
		System.out.println("id:"+id);
		System.out.println("worktype:"+Worktype);
		System.out.println("----------------------");

	}
}

class Department
{
	String DepartName;
	int id;
	String Location;
	int pincode;

	{
		DepartName="IT ";
		id=1099;
		Location="Bangalore";
		pincode=584728;
		System.out.println("DepartName:"+DepartName);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("pincode:"+pincode);
		System.out.println("-----------------------");
	}
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
	{
		InsurenceName="LIC";
		InsurenceType="Health Insurence";
		CustomerName="Rahul";
		id=8988;
		System.out.println("InsurenceName:"+InsurenceName);
		System.out.println("InsurenceType:"+InsurenceType);
		System.out.println("CustomerName:"+CustomerName);
		System.out.println("id:"+id);
	}
}

public class EmployeeDepartmentInsuranceNoArgs {

	public static void main(String[] args) {
		Employee ravi= new Employee();
		Department branch=new Department();
		Insurence Life= new Insurence();
	}

}


