package com.gentech.constructor;

class vowel
{
	vowel(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("It is Vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
	}

}

public class VowelOrNot {

	public static void main(String[] args) {
		vowel obj1 = new vowel('A');
		vowel obj2 = new vowel('M');
		vowel obj3 = new vowel('i');
		vowel obj4 = new vowel('K');

	}

}
