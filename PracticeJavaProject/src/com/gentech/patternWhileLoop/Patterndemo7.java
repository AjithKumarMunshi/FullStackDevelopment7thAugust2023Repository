package com.gentech.patternWhileLoop;
/*
1 
4 9 
16 25 36 
49 64 81 100
 */

public class Patterndemo7 {

	public static void main(String[] args) {
		int j=1;
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)

			{
				System.out.print(j*j+"  ");
				j++;
				k++;

			}
			i++;
			System.out.println();


		}

	}

}
