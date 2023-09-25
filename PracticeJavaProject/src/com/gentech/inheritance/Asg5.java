package com.gentech.inheritance;
class sample51 
{
	sample51(String name) 
	{
		System.out.println("Super Class name : " + name);
	}
}

class sample52 extends sample51
{
	sample52(String name) 
	{
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class sample53 extends sample52 
{
	sample53(String name) 
	{
		super(name);
		System.out.println("Child Class of child class 1 ");
	}
}
class sample54 extends sample53
{
	sample54(String name) 
	{
		super(name);
		System.out.println("Child Class of child class 2 ");
	}
}
public class Asg5 {

	public static void main(String[] args) {
		sample54 obj = new sample54("Ajith");

	}

}
