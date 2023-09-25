package com.gentech.inheritance;
class sample1 {
	String names;
	int rollno;
	int mobilenum;

	sample1(String name, int rno, int mno)
	{
		names = name;
		rollno = rno;
		mobilenum = mno;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class sample2 extends sample1 {
	String names;
	int rollno;
	int mobilenum;

	sample2(String name, int rno, int mno) {
		super(name, rno, mno);
		names = name;
		rollno = rno;
		mobilenum = mno;
		System.out.println(" Class name 1: " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class sample3 extends sample2 {
	String names = "";
	int rollno;
	int mobilenum;

	sample3(String name,int rno,int mno)
	{
		super(name,rno,mno);
		names = name;
		rollno = rno;
		mobilenum = mno;
		System.out.println(" Class  name 2 : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " +mobilenum);
	}
}

public class Asg6 {

	public static void main(String[] args) {
		sample3 obj = new sample3("Ajith", 777, 584128);
	}

}
