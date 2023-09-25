package com.gentech.patternWhileLoop;
/* 1 
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

public class Patterndemo5 {

	public static void main(String[] args) {

		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)

			{
				System.out.print(i+"  ");

				k++;

			}
			i++;
			System.out.println();


		}
	}
}