package com.gentech.inheritance1;
class employee
{
	String name;

	void showemplyname(String name)
	{
		System.out.println("Employee name :"+name);
	}
}
class employee1 extends employee
{
	employee1(String company)
	{
		super.name=company;
		super.showemplyname(company);
	}
	String name;
	void showemplyname(String name)
	{
		System.out.println("Employee name :"+name);
	}
}
class employee2 extends employee1
{
	employee2(String name)
	{
		super( name);
		super.showemplyname( name);	

	}
	String name;
	void showemplyname(String locname)
	{
		System.out.println("company name:"+locname);
	}
}

public class Asg3 {

	public static void main(String[] args) {
		employee2 obj=new employee2("rahul");
		obj.showemplyname("tata");
		obj.showemplyname("bangalore");

	}

}
