package com.gentech.noargsconstructor;


class Students
{
	String FirstName;
	int age;
	String course;
	int id  ;
	{
		FirstName="Rajkumar";
		age=21;
		course="BSC";
		id=13;
		System.out.println("FirstName:"+FirstName);
		System.out.println("Age:"+age);
		System.out.println("course:"+course);
		System.out.println("id:"+id);
		System.out.println("----------------------");	
	}}

class Library
{
	String FirstName;
	int id;
	String BookName;
	String Address;
	{
		FirstName="Surya";
		id=1123;
		BookName="wings of fire";
		Address="raichur";
		System.out.println("FirstName:"+FirstName);
		System.out.println("id:"+id);
		System.out.println("BookName:"+BookName);
		System.out.println("Address:"+Address);
		System.out.println("-----------------------");

	}}

class Sports
{
	String SportsName;
	String Coach;
	int NoofPLAYERS;
	int id;
	{
		SportsName="cricket";
	     Coach="Rahul";
		NoofPLAYERS=11;
		id=8988;
		System.out.println("SportsName:"+SportsName);
		System.out.println("Coach:"+Coach);
		System.out.println("NoofPLAYERS:"+NoofPLAYERS);
		System.out.println("id:"+id);
	}}

public class StudentsLibrarySportsNoArgs {

	public static void main(String[] args) {
		
	

		Students Details= new Students();
		

		Library Information=new Library();
		

		Sports Fitness= new Sports();
		

	}}
		
		
		
		
		
		
		
		