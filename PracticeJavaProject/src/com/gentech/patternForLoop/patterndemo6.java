package com.gentech.patternForLoop;
/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 


 */

public class patterndemo6 {

	public static void main(String[] args) {
		int j=5;
		for (int i = 1; i<= 5; i++)
		{

			for (int k=1; k<=i; k++) 
			{
				System.out.print(j+" ");
				j=j+5;
			}
			System.out.println();
		}
	}

}
