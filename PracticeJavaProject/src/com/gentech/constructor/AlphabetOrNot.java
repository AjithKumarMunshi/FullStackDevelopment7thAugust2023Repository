package com.gentech.constructor;
class alphabet
{
	alphabet(char ch)
	{
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}
	alphabet()
	{
	}
}
public class AlphabetOrNot {

	public static void main(String[] args) {
		alphabet obj1 = new alphabet('+');
		alphabet obj2 = new alphabet('P');
		alphabet obj3 = new alphabet('U');
		alphabet obj4 = new alphabet('*');		
	}
}
