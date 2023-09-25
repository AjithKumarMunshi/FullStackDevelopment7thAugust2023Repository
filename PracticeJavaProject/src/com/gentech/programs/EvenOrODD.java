package com.gentech.programs;

public class EvenOrODD {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num%2==0)
		{
			System.out.println(num+ "The given number is even");
		}
		else
		{
			System.out.println(num+ "The given number is odd");

		}

	}
}