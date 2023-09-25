package com.gentech.recrussionstatic;
class DivisibleBy8 
{
	static void DivisibleBy8No(int a, int b)
	{
		if (a<=b) 
		{
			if (a%8 == 0)
			{
				
				System.out.println(a+" ");
			}
			
			DivisibleBy8No(a+1,b);
		}
	}
}
public class DivsibleBy8 {

	public static void main(String[] args) {
		DivisibleBy8.DivisibleBy8No(1,100);

	}

}
