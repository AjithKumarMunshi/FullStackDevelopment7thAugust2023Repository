package com.gentech.polymorphism;

abstract class BloodsTypes
{
	abstract void Blood();
}

class Blood1 extends BloodsTypes
{
	void Blood()
	{
		String BloodType = "A+";
		String Name = "Rahul";
		System.out.println(" Blood type: " + BloodType);
		System.out.println(" Donated Name : "+ Name);
		System.out.println();
	}
}

class Blood2 extends BloodsTypes
{
	void Blood()
	{
		String BloodType = "o+";
		String Name = "Ram";
		System.out.println(" Blood type: " + BloodType);
		System.out.println(" Donated Name : "+ Name);
		System.out.println();
	}
}

class Blood3 extends BloodsTypes
{
	void Blood()
	{
		String BloodType = "B-";
		String Name = "Teju";
		System.out.println(" Blood type: " + BloodType);
		System.out.println(" Donated Name : "+ Name);
		System.out.println();
	}
}

public class Asg3 
{
	public static void main(String[] args) 
	{
		BloodsTypes blood = null;

		Blood1 b1 = new Blood1();
		Blood2 b2 = new Blood2();
		Blood3 b3= new Blood3();

		blood  = b1;
		blood .Blood();

		blood =b2;
		blood .Blood();

		blood =b3;
		blood .Blood();
	}
}


