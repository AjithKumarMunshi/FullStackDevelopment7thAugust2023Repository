package com.gentech.patternWhileLoop;
/* 2
 * 2 2
 * 2 2 2
 * 2 2 2 2
 * 2 2 2 2 2
 */

public class patterndemo1 {

	public static void main(String[] args) {
		int i=1;

		while(i<=5) {
			int k=1;
			while(k<=i)
			{
				System.out.print(" 2 ");
				k++;
			}
			i++;
			System.out.println();


		}

	}

}
