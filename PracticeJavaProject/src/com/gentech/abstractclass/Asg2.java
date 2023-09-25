package com.gentech.abstractclass;

abstract class Static1
{
	static 
	{
		System.out.println(" my name is ajith");
	}
}

class Static2a extends Static1
{

}
public class Asg2 {

	public static void main(String[] args) {
		Static2a o = new Static2a();
	}
}




