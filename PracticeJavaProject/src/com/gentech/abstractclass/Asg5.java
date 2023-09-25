package com.gentech.abstractclass;

abstract class MultiLevelInheritance
{
	abstract void value1();
	abstract void value2();
}
abstract class MultiLevelInheritance1 extends MultiLevelInheritance
{

	void value1()
	{
		System.out.println("Surya");
	}
	abstract void value2();
}

class MultiLevelInheritance2 extends MultiLevelInheritance1
{
	void value2()
	{
		System.out.println("Kishore");
	}
}
public class Asg5 {

	public static void main(String[] args) {
		MultiLevelInheritance2 obj = new MultiLevelInheritance2();
		obj.value1();
		obj.value2();
	}

}







