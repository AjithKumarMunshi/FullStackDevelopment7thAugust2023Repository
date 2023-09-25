package com.gentech.polymorphism;

abstract class Ball 
{
	abstract void describe();
}

class Football extends Ball 
{

	void describe() 
	{
		System.out.println("Football");
	}
}

class Basketball extends Ball  
{

	void describe() 
	{
		System.out.println(" Basketball");
	}
}

class TennisBall extends Ball 
{

	void describe()

	{
		System.out.println(" Tennis Ball");
	}
}

public class Asg6 {
	public static void main(String[] args) {
		Ball ball = null;

		Football football = new Football();
		Basketball basketball = new Basketball();
		TennisBall tennisBall = new TennisBall();

		ball =  football ;
		ball.describe();

		ball = basketball;
		ball.describe();

		ball = tennisBall;
		ball.describe();
	}
}

