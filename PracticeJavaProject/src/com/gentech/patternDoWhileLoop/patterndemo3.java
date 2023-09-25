package com.gentech.patternDoWhileLoop;
/* 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3 
 * 1 2
 * 1 
 */

public class patterndemo3 {

	public static void main(String[] args) {
		int i=5;
		do 
		{
			int k=1;
			do
			{
				System.out.print(k+" ");
				k++;
			}while(k<=i);
			i--;
			System.out.println();
		}while(i>=1);


	}

}
