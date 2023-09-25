package com.gentech.constructoroverloading;


class student
{
	student(String studentName,int studentrollno)

	{
		System.out.println("Student Name:"+studentName);

		System.out.println("Student Rollno:"+studentrollno);
		System.out.println("+++++++++++++++");
	}
	student( int studentmarks,String studentfavsubject)
	{
		System.out.println("Student marks:"+studentmarks);
		System.out.println("Student favorite subject:"+studentfavsubject);
	}
}

public class Students {

	public static void main(String[] args) {
		student AA=new student("Ramesh",3);

		student BB=new student(97,"maths");

	}

}
