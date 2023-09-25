package com.gentech.recrussionstatic;
class evenno 
{
	static void displayEvenNumbers(int a, int b)
	{
		if (a>=b) 
		{
			if (a%2==0) 
			{
				System.out.println(a+ " ");
			}
			displayEvenNumbers(a - 1, b);
		}
	}
}
public class EvenNo20To1
{

	public static void main(String[] args) 
	{
		evenno.displayEvenNumbers(20, 1);

	}

}




