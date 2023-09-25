package com.gentech.inheritance;
class sample9 {
	String names;
	int rollno;
	int pincode;

	sample9(String name, int rno)
	{
		names = name;
		rollno = rno;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	sample9(int mno) 
	{
		pincode = mno;
		System.out.println("Super Class College Code : " + pincode);
	}
}

class sample92 extends sample9 
{
	String names;
	int rollno;
	int pincode;

	sample92(String name, int rno) 
	{
		super(name, rno);
		names = name;
		rollno = rno;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	sample92(int mno) 
	{
		super(mno);
		pincode = mno;
		System.out.println("Child class 1 College Code : " + pincode);
	}
}

class sample93 extends sample92 
{
	String names = "";
	int rollno;
	int pincode;

	sample93(String name, int rno) 
	{
		super(name, rno);
		names = name;
		rollno = rno;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	sample93(int mno) 
	{
		super(mno);
		pincode = mno;
		System.out.println("Child Class 2 College Code : " + pincode);
	}
}

class sample94 extends sample9 
{
	String names = "";
	int rollno;
	int pincode;

	sample94(String name, int rno) 
	{
		super(name, rno);
		names = name;
		rollno = rno;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	sample94(int mno)
	{
		super(mno);
		pincode = mno;
		System.out.println("Child Class 2 College Code : " +pincode);
	}
}

public class Asg9 {

	public static void main(String[] args) {
		sample93 obj = new sample93("ajith", 49);
		System.out.println();
	
		sample93 obj2 = new sample93(5645275);
		System.out.println();
	
		sample94 obj3 = new sample94("raj", 151);
		System.out.println();

		sample94 obj4 = new sample94(545298);
	}

}




