package com.gentech.patternWhileLoop;
/* 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3 
 * 1 2
 * 1 
 */

public class patterndemo3 {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(k+"  ");
				k++;
			}
			i--;
			System.out.println();


		}
	}

}
