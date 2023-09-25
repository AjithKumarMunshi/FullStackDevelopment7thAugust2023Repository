package com.gentech.patternDoWhileLoop;
/* 2
 * 2 2
 * 2 2 2
 * 2 2 2 2
 * 2 2 2 2 2
 */

public class patterndemo1 {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(" 2");
				k++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
