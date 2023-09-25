package com.gentech.pattern;
/* 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class patterndemonewwhile {

	public static void main(String[] args) {
		int i=1;

		while(i<=5) {
			int k=1;
			while(k<=i)
			{
				System.out.print(k+" ");
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
