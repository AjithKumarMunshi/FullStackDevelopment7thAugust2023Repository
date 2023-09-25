package com.gentech.pattern;
/* 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

public class patterndemonewdowhile {

	public static void main(String[] args) {
		int i=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(k+" ");
				k++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
