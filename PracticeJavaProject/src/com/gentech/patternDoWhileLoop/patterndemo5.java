package com.gentech.patternDoWhileLoop;
/* 1 
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

public class patterndemo5 {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(i+" ");
				k++;

			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}

