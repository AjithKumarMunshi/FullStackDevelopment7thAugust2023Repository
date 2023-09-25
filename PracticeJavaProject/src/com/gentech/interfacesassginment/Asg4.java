package com.gentech.interfacesassginment;
// hybrid level

interface Library4 
{
	void method1(String name);
}


interface Bookname4 extends Library4 
{
	void method2(String bookname);
}


interface Address4 extends Bookname4
{
	void method3(String name);
}

interface Author4 extends Library4
{
	void method4(int mobileno);
}

class Hybrid implements Author4, Address4
{
	public void method1(String name) 
	{
		System.out.println("Library name: " + name);
	}

	public void method2(String bookname) 
	{
		System.out.println("Book name: " + bookname);
	}

	public void method3(String name) 
	{
		System.out.println("Address name: " + name);
	}
	public void method4(int mobileno) 
	{
		System.out.println("mobile no : " + mobileno);
	}

}

public class Asg4 {

	public static void main(String[] args) {

		Hybrid o = new Hybrid();

		o.method1("Central Library");
		System.out.println("-----------------------------------");

		o.method2("Maguldi Days");
		System.out.println("-----------------------------------");

		o.method3("Sindhanur");
		System.out.println("-----------------------------------");

		o.method4(654424584);
		System.out.println("-----------------------------------");
	}

}


