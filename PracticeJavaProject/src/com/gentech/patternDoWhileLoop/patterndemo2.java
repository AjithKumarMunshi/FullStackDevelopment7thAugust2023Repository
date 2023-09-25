package com.gentech.patternDoWhileLoop;
/* 5 5 5 5 5
 * 5 5 5 5
 * 5 5 5
 * 5 5
 * 5
 */

public class patterndemo2 {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(" 5");
				k++;
			}while(k<=6-i);
			i++;
			System.out.println();
		}while(i<=5);
	}

}
