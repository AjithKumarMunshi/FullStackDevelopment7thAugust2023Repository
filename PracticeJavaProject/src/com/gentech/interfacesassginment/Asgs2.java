package com.gentech.interfacesassginment;
//in which interface contain more than 3

interface library2 
{
	 public static final String name1 = (" central library");
	 public static final String name2 = (" malgudi days");
	 public static final String name3 = (" R k naryana");

	void method1();

	void method2();

	void method3();
}

class librarydetails2 implements library2 
{
	public void method1() 
	{
		System.out.println(" Library name :" + name1);
	}

	public void method2() 
	{
		System.out.println(" Book name    :" + name2);
	}

	public void method3() 
	{
		System.out.println(" Author name  :" + name3);
	}
}

public class Asgs2 {

	public static void main(String[] args) {
		librarydetails2 o = new librarydetails2();
		o.method1();
		o.method2();
		o.method3();
	}
}
