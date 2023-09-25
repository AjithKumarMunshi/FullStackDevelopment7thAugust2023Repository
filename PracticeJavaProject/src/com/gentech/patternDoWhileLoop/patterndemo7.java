package com.gentech.patternDoWhileLoop;
/*
1 
4 9 
16 25 36 
49 64 81 100
 */

public class patterndemo7 {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		do 
		{
			int k=1;
			do
			{
				System.out.print(j*j+" ");
				j++;
				k++;

			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=4);

	}

}
