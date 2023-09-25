package com.gentech.constructor;

class find
{
	int c = 0;
	int temp = 0;
	find(int n)
	{
		temp = n;
		c = n%10;
		while(c>0)
		{
			if((temp%10) == c)
			{
				temp = temp/10;
				c--;
			}
			else
			{
				System.out.println("Missing : "+c);
				break;
			}
		}
	}

}
public class Missing {

	public static void main(String[] args) {
		find obj = new find(1245678);
		find obj2 = new find(1235678);
		find obj3 = new find(12345689);
	}

}
