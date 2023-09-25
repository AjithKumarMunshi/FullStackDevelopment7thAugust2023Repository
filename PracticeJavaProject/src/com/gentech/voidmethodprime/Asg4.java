package com.gentech.voidmethodprime;
class prime4 {
	void countPrimes(int a, int b)
	{
		int count = 0;
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
			if (k == 1)
			{
				count++;
			}
		}     System.out.println("The Count of prime numbers is: " + count);

	}
}

public class Asg4 {

	public static void main(String[] args) {
		prime4 o1 = new prime4();
		o1.countPrimes(150, 300);

	}

}
