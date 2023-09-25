package com.gentech.patternForLoop;
/* 5 5 5 5 5
 * 5 5 5 5
 * 5 5 5
 * 5 5
 * 5
 */

public class patterndemo2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int k=1; k<=6-i; k++) 
			{
				System.out.print("5 ");
			}
			System.out.println();
		}

	}

}

