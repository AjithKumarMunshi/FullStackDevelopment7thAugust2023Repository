package com.gentech.patternForLoop;
/* 2
 * 2 2
 * 2 2 2
 * 2 2 2 2
 * 2 2 2 2 2
 */

public class patterndemo1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" 2 ");
			}
			System.out.println();
		}
	}
}


