package com.gentech.patternWhileLoop;
/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 


 */

public class Patterndemo6 {

	public static void main(String[] args) {

		int j=5;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)

			{
				System.out.print(j+"  ");
				j=j+5;
				k++;

			}
			i++;
			System.out.println();


		}
	}

}
