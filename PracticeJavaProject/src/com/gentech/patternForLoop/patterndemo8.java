package com.gentech.patternForLoop;
/*15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 */

public class patterndemo8 {

	public static void main(String[] args) {
		int j=15;
		for (int i = 5; i>=1; i--)
		{

			for (int k=1; k<=i; k++) 
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
		}

	}

}
