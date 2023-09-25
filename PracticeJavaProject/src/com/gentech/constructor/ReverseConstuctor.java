package com.gentech.constructor;

class reverse
{
	int d = 0;
	int c=0;
	reverse(int n)
	{
		d = n;
		while(d>0)
		{
			c = c*10 + (d%10);
			d = d/10;	
		}
		System.out.println("Reverse : " +c);
	}

}
public class ReverseConstuctor {

	public static void main(String[] args) {
		reverse obj  =new reverse(123);
		reverse obj1  =new reverse(456);
		reverse obj2  =new reverse(789);
		reverse obj3  =new reverse(636);

	}

}

