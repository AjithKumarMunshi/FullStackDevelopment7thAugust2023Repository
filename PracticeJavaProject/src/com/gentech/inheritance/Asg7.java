package com.gentech.inheritance;
class samples1 
{
	String names;
	int rollno;
	int mobilenum;
	String fathername;

	samples1(String name, int rno,String fna) 
	{
		names = name;
		rollno = rno;
		fathername=fna;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);

	}

	samples1(int mno) 
	{
		mobilenum = mno;
		System.out.println("Super Class College Code : " + mobilenum);
	}
}

class samples2 extends samples1
{
	String names;
	int rollno;
	int mobilenum;
	String fathername;


	samples2(String name, int rno,String fna) 
	{
		super(name, rno,fna);
		names = name;
		rollno = rno;
		fathername=fna;

		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	samples2(int mno) 
	{
		super(mno);
		mobilenum = mno;
		System.out.println("Child class 1 College Code : " + mobilenum);
	}
}

class samples3 extends samples2 
{
	String names = "";
	int rollno;
	int mobilenum;
	String fathername;

	samples3(String name, int rno,String fna) 
	{
		super(name, rno,fna);
		names = name;
		rollno = rno;
		fathername=fna;

		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	samples3(int mno)
	{
		super(mno);
		mobilenum = mno;
		System.out.println("Child Class 2 College Code : " +mobilenum);
	}
}

public class Asg7 {

	public static void main(String[] args) {
		samples3 obj = new samples3("ajith", 456,"janardhan");
		samples3 obj2 = new samples3(584128);

	}

}






