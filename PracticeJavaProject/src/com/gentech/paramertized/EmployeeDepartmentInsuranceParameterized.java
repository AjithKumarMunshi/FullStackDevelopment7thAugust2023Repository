package com.gentech.paramertized;

class Employee
{
	  
	  Employee(String FirstName,int age,int id,String Worktype){
		   
			System.out.println("FirstName:"+FirstName);
			System.out.println("Age:"+age);
			System.out.println("id:"+id);
			System.out.println("worktype;"+Worktype);
			System.out.println("----------------------");
	  }
}  
	  
class Department
{
	
	Department(String DepartName,int id,String Location,int Zipcode){
		
		System.out.println("DepartName:"+DepartName);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("Zipcode:"+Zipcode);
		System.out.println("-----------------------");
	}
}

class Insurence
{
	
	Insurence(String InsurenceName,String InsurenceType,String CustomerName,int id){
		
		System.out.println("InsurenceName:"+InsurenceName);
		System.out.println("InsurenceType:"+InsurenceType);
		System.out.println("CustomerName:"+CustomerName);
		System.out.println("id:"+id);
	}
}

public class EmployeeDepartmentInsuranceParameterized {

	public static void main(String[] args) {
				
				Employee e= new Employee("rahul",21,8956,"manager");
				
				Department d=new Department("EEE",9099,"ballari",584128);
			
				Insurence life= new Insurence("LIC","Health Insurence","ravi",7896);			
	}
}








