package com.gentech.patternWhileLoop;
/* 1 
 * 2 3 
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */

public class Patterndemo4 {

	public static void main(String[] args) {
		int j=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)

			{
				System.out.print(j+"  ");
				j++;
				k++;

			}
			i++;
			System.out.println();


		}
	}

}
