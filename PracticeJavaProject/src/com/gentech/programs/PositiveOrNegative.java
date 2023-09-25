package com.gentech.programs;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>0)
		{
			System.out.println(num+"The numbere is Positive");
		}
		else if(num<0)
		
		{
			System.out.println(num+"The numbere is Negative");
		}
		else
			System.out.println(num+"the numbere is zero");
	}

}
