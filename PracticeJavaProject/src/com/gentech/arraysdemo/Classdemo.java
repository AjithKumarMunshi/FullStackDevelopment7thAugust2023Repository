package com.gentech.arraysdemo;



 
		class college
		{
			college(String studentName,int usn)
			
			{
				System.out.println("Student Name:"+studentName);
				
				System.out.println("USN:"+usn);
			}
			college( String branch,String course)
			{
				System.out.println("Branch:"+branch);
				System.out.println("Course:"+course);
			}
		}


public class Classdemo {

	public static void main(String[] args) {
				college ch=new college("Rahul",3);
				
				college vh=new college("EEE","BE");
			}

		

	}


