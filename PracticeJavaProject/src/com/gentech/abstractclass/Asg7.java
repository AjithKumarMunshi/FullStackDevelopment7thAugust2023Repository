package com.gentech.abstractclass;

abstract class MultiLevelParametrized
{
	MultiLevelParametrized(String firstname) 
	{
		System.out.println("First name : "+firstname);
	}
}

class MultiLevelParametrized1 extends MultiLevelParametrized
{
	MultiLevelParametrized1(String name) {
		super(name);
	}
	void value1()
	{
		System.out.println("Adresss:sindhanur ");
	}
}

class MultiLevelParametrized2 extends MultiLevelParametrized1
{
	MultiLevelParametrized2(String name){
		super(name);
	}
}
public class Asg7 {

	public static void main(String[] args) {
		MultiLevelParametrized2 obj = new MultiLevelParametrized2("raj");
		obj.value1();

	}

}









