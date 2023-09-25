package com.gentech.inheritance;
class sample8 {
	String names;
	int rollno;
	int pincode;

	sample8(String name, int rno, int mno) {
		names = name;
		rollno = rno;
		pincode = mno;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class sample82 extends sample8 {
	String names;
	int rollno;
	int pincode;

	sample82(String name, int rno, int mno) {
		super(name, rno, mno);
		names = name;
		rollno = rno;
		pincode = mno;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class sample83 extends sample82 {
	String names = "";
	int rollno;
	int pincode;

	sample83(String name, int rno, int mno) {
		super(name, rno, mno);
		names = name;
		rollno = rno;
		pincode = mno;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class sample84 extends sample8 {
	String names = "";
	int rollno;   
	int pincode;

	sample84(String name,int rno,int mno)
	{
		super(name,rno,mno);
		names = name;
		rollno = rno;
		pincode = mno;
		System.out.println("Child Class 3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}

public class Asg8 {

	public static void main(String[] args) {
		sample83 obj = new sample83("rahul ", 84, 5486123);
		sample84 obj2 = new sample84("ram", 444, 564517);
	}
}
