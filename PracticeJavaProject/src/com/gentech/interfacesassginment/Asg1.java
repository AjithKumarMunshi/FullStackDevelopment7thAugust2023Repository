package com.gentech.interfacesassginment;

interface Library
{
	void method1(String name);
}


interface Bookname
{
	abstract void method2(String bookname);
}


interface Address
{
	void method3(String name);
}

interface Librarydetails extends Library,Bookname,Address
{
	void method4(int n);
}

class MultipleInheritance implements Librarydetails
{

	public void method1(String name) 
	{
		System.out.println("library name:"+name);
	}


	public void method2(String bookname) 
	{
		System.out.println("Book name:"+bookname);
	}


	public void method3(String name) 
	{
		System.out.println("Address name:"+ name);
	}

	public void method4(int num) 
	{
		System.out.println("mobile no ="+num);
	}
}

public class Asg1 
{
	public static void main(String[] args) {
		MultipleInheritance o = new MultipleInheritance();

		o.method1("central library");
		o.method2("Maguldi days");
		o.method3("sindhanur");
		o.method4(636548754);
	}
}


