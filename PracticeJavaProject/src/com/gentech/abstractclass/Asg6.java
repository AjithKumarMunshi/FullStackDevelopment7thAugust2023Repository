package com.gentech.abstractclass;
abstract class HybridLevelInheritance
{
	abstract void value1();
	abstract void value2();
}

abstract class HybridLevelInheritance1 extends HybridLevelInheritance
{

	void value1()
	{
		System.out.println("Raj ");
	}
	abstract void value2();
}

class HybridLevelInheritance2 extends HybridLevelInheritance1
{
	void value2()
	{
		System.out.println("Kumar");
	}
}

class HybridLevelInheritance3 extends HybridLevelInheritance
{


	void value1()
	{
		System.out.println("malgudi days");
	}
	void value2()
	{
		System.out.println("R k naranya");
	}
}
public class Asg6 {

	public static void main(String[] args) {
		HybridLevelInheritance2 obj = new HybridLevelInheritance2();
		obj.value1();
		obj.value2();

		System.out.println();

		HybridLevelInheritance3 obj2 = new HybridLevelInheritance3();
		obj2.value1();
		obj2.value2();
	}

}






