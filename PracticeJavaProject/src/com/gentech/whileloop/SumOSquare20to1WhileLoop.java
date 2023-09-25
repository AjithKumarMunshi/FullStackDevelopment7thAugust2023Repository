package com.gentech.whileloop;

public class SumOSquare20to1WhileLoop {

	public static void main(String[] args) {
		int square=0;
		int i=20;
		while(i>=1)
		{
			square=square+(i*i);
			i--;
		}
		System.out.println(square);
	}
}
