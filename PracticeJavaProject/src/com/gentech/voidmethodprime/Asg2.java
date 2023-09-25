package com.gentech.voidmethodprime;
class prime2{
	void isprime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int k=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}
			}
			if(k==1)
			{
				System.out.println("Prime Numbers are :"   +i );
			}
		}

	}
}
public class Asg2 {

	public static void main(String[] args) {
		prime2 o1 = new prime2();
		o1.isprime(1,50);
	}

}
