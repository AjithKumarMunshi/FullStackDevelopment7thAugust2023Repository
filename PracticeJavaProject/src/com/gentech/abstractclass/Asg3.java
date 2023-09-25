package com.gentech.abstractclass;

abstract class Noargs
{
	Noargs()
	{
		System.out.println("My name is aj ");
	}
}
class Noargs1 extends Noargs
{

}

public class Asg3 {

	public static void main(String[] args) {

		Noargs1 obj1 = new Noargs1();
	}

}

