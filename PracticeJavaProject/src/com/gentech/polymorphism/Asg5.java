package com.gentech.polymorphism;

interface relation       
{
	abstract void display();
}

class  Grandfather  
{
	void display()
	{
		System.out.println("Grandfather");
	}
}

class Father extends  Grandfather
{
	void display()
	{
		System.out.println("Father");
	}
}

class Son extends  Father 
{
	void display() 
	{
		System.out.println("Son");
	}
}

public class Asg5 {
	public static void main(String[] args) {

		Grandfather  person = null;

		Grandfather grandfather = new Grandfather();
		Father father = new Father();
		Son son = new Son();

		person = grandfather;
		person.display();

		person = father;
		person.display();

		person = son;
		person.display();
	}
}

