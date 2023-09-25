package com.gentech.constructor;

class digits
{
	int d = 0;
	int c=0;
	digits(int n)
	{
		d = n;
		while(d>0)
		{
			c++;
			d = d/10;	
		}
		System.out.println("No of Digits : " +c);
	}

}
public class DigitsNo {

	public static void main(String[] args) {
		digits obj = new digits(63618763);
		digits obj1 = new digits(6361876);
		digits obj2 = new digits(636187639);
	}

}


