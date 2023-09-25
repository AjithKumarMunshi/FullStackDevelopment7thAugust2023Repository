package com.gentech.patternDoWhileLoop;
/*15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 */
public class patterndemo8 {

	public static void main(String[] args) {
		int i=5;
		int j=15;
		do 
		{
			int k=1;
			do
			{
				System.out.print(j+" ");
				j--;
				k++;

			}while(k<=i);
			i--;
			System.out.println();
		}while(i>=1);


	}

}
