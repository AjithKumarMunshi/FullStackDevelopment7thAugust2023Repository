package com.gentech.programs;

public class LargestTwoNumberes {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		if (num1>num2)
		{
			System.out.println(num1+ " is the greater number");
		}
		else if (num2>num1)
		{
			System.out.println(num2+ " is the greater number");
		}
		else
		{
			System.out.println(" is the equal number");
		}

	}

}
