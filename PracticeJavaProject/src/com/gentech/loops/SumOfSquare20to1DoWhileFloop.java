package com.gentech.loops;

public class SumOfSquare20to1DoWhileFloop {

	public static void main(String[] args) {
		int square=0;
		int i=20;
		do
		{
			square=square+(i*i);
			i--;
		}while(i>=1);
		System.out.println(square);
	}
}
