package com.gentech.classes;

class Students
{
	String FirstName;
	int age;
	String course;
	int id  ;
}  

class Library
{
	String FirstName;
	int id;
	String BookName;
	String Address;
}

class Sports
{
	String SportsName;
	String Coach;
	int NoofPLAYERS;
	int id;
}


public class StudentLibrarySports {

	public static void main(String[] args) {

		Students Details= new Students();
		Details.FirstName="Rajkumar";
		Details.age=21;
		Details.course="BSC";
		Details.id=13;
		System.out.println("FirstName:"+Details.FirstName);
		System.out.println("Age:"+Details.age);
		System.out.println("course:"+Details.course);
		System.out.println("id:"+Details.id);
		System.out.println("----------------------");

		Library Information=new Library();
		Information.FirstName="Surya";
		Information.id=1123;
		Information.BookName="wings of fire";
		Information.Address="raichur";
		System.out.println("FirstName:"+Information.FirstName);
		System.out.println("id:"+Information.id);
		System.out.println("BookName:"+Information.BookName);
		System.out.println("Address:"+Information.Address);
		System.out.println("-----------------------");

		Sports Fitness= new Sports();
		Fitness.SportsName="cricket";
		Fitness.Coach="Rahul";
		Fitness.NoofPLAYERS=11;
		Fitness.id=8988;
		System.out.println("SportsName:"+Fitness.SportsName);
		System.out.println("Coach:"+Fitness.Coach);
		System.out.println("NoofPLAYERS:"+Fitness.NoofPLAYERS);
		System.out.println("id:"+Fitness.id);
	}

}







