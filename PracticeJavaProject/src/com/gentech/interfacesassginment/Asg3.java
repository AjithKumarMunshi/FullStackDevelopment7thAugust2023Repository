package com.gentech.interfacesassginment;
//multi level
interface Library3 
{
	void method1(String name);
}


interface Bookname3 extends Library3 
{
	abstract void method2(String bookname);
}


interface Address3 extends Bookname3
{
	void method3(String name);
}


class Multilevel implements Address3
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

}

public class Asg3 
{
	public static void main(String[] args) 
	{
		Multilevel o = new Multilevel();

		o.method1("Central Library");
		System.out.println("-----------------------------------");

		o.method2("Maguldi Days");
		System.out.println("-----------------------------------");

		o.method3("Sindhanur");
		System.out.println("-----------------------------------");

	}
}


