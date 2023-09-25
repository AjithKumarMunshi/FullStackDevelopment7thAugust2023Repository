package com.gentech.recrussionstatic;
class oddno 
{
	static void displayOddNumbers(int a, int b)
	{
		if (a<=b) 
		{
			if (a%2==1)
			{
				System.out.println(a+ " ");
			}
			displayOddNumbers(a+1, b);
		}
	}
}

public class OddNo20To40 {

	public static void main(String[] args) {
		oddno.displayOddNumbers(20, 40);
	}

}



