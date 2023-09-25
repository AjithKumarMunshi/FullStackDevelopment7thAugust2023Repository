package com.gentech.patternForLoop;
/* 1 
 * 2 3 
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */

public class patterndemo4 {

	public static void main(String[] args) {
		int j=1;
		for (int i = 1; i<= 5; i++)
		{

			for (int k=1; k<=i; k++) 
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}

	}

}
