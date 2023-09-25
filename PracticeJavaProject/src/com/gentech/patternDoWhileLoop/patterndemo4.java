package com.gentech.patternDoWhileLoop;
/* 1 
 * 2 3 
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class patterndemo4 {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(j+" ");
				j++;
				k++;

			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
