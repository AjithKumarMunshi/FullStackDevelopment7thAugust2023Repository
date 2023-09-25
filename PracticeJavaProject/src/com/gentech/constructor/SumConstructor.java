package com.gentech.constructor;

class sum
{
	int d = 0;
	int c=0;
	sum(int n)
	{
		d = n;
		while(d>0)
		{
			c = c + (d%10);
			d = d/10;

		}
		System.out.println("Sum : " +c);
	}

}
public class SumConstructor {

	public static void main(String[] args) {
		sum obj = new sum(123);
		sum obj1 = new sum(999);
		sum obj2 = new sum(753);
		sum obj3 = new sum(111);
	}

}



