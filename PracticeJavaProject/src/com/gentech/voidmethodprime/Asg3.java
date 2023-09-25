package com.gentech.voidmethodprime;
class prime3 {
	void sumPrime(int a, int b) 
	{
		int sum=0;
		for (int i = a; i <= b; i++)
		{
			int k = 1;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0) 
				{
					k = k + 1;
					break;
				}
			}
			if (k==1) 
			{
				sum =sum+ i;

			}
		}System.out.println("Sum of prime number is: " + sum);
	}
}

public class Asg3 {

	public static void main(String[] args) {
		prime3 o1 = new prime3();
		o1.sumPrime(100, 200);

	}

}
