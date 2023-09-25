package com.gentech.recrussionstatic;
class recrussion
{
	//Display odd numbers between 20 to 40

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


	//Display Even number between 20 to 1

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


	//Display number divisible by 8

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


	//Display count of numbers divisible by 10

	static int count=100;
	static void showcountdivisibleby10()
	{
		if(count<=200)
		{
			if(count%10==0)
			{
				System.out.println(count);


				count=count+1;
				showcountdivisibleby10();
			}
		}
	}

	// Display Tenth Table

	static int i=1;
	static void showtentable()
	{
		if(i<=10)
		{
			System.out.println("10*"+i+"="+i*10);

			i++;
			showtentable();
		}
	}

	//Display fiveTable in reverse

	static int p=10;
	static void showfivetable()
	{
		if(p>=1)
		{
			System.out.println("5*"+p+"="+p*5);
			p--;
			showfivetable();

		}
	}
}

public class Asgs {

	public static void main(String[] args) {
		recrussion.displayOddNumbers(20,40);
		System.out.println("-----------------------------");

		recrussion.displayEvenNumbers(20,1);
		System.out.println("-------------------------------");

		recrussion.DivisibleBy8No(1,100);
		System.out.println("---------------------------------");

		recrussion.showcountdivisibleby10();
		System.out.println("----------------------------------");

		recrussion.showtentable();
		System.out.println("---------------------------------");

		recrussion.showfivetable();
		System.out.println("---------------------------------");
	}

}

