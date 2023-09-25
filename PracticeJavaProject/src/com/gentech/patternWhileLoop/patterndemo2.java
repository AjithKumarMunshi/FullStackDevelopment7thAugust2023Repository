package com.gentech.patternWhileLoop;
/* 5 5 5 5 5
 * 5 5 5 5
 * 5 5 5
 * 5 5
 * 5
 */


public class patterndemo2 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int k=1;
			while(k<=6-i)
			{
				System.out.print(" 5 ");
				k++;
			}
			i++;
			System.out.println();


		}

	}

}
