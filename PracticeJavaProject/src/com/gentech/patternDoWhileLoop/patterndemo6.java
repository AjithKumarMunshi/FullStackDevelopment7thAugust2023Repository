package com.gentech.patternDoWhileLoop;
/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 


 */

public class patterndemo6 {

	public static void main(String[] args) {
		int i=1;
		int j=5;
		do 
		{
			int k=1;
			do
			{
				System.out.print(j+" ");
				j=j+5;
				k++;

			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);

	}

}
