package com.gentech.methods;
class assignments
{
	// byte array read second half element

	void bytearray(byte[] a)
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d array read first half of element

	void shortarray(short s[])
	{
		for(int i=s.length/2;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d integer array read the first half of element

	void intarray(int a[])
	{
		for(int i=a.length/2-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d char array

	void chararray(char ch[])
	{
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			s = s + ch[i];
		}
		System.out.println("concatinated chars : ");
		System.out.println(s);
	}


	//one d string array create the element

	void stringarray(String s[])
	{
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+",");
		}
		System.out.println();
		System.out.println();
	}

	//one d integer array find sum of all element

	void onedarraysum(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}

	//one d char array display vowel separate

	void charvowel(char c[])
	{
		for(int i=0;i<c.length;i++)
		{
			char ch = c[i];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				System.out.print(ch+", ");
			}
		}
		System.out.println();
		System.out.println();
	}

	//2 d 3x3 integer array read last row

	void int2darray(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[2][i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	//2d 3x3 integer array find the sum of element of first row

	void int2dsumarray(int a[][])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[0][i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}

	//sum of two matrix in reverse order

	void subtract(int a[][],int b[][])
	{
		int res[][] = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[0].length;j++)
			{
				res[i][j] = a[i][j] - b[i][j];
			}
		}

		for(int i = a.length-1;i>=0;i--)
		{
			for(int j = a[0].length-1;j>=0;j--)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

	}

	//one d integer array square of each element

	void squarearray(int x[])
	{
		System.out.println();
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + (x[i]*x[i]);
		}
		System.out.print("sum :"+sum);
		System.out.println();

	}

	//two d string array concadeniate all element

	void concatstring(String str[][])
	{
		String s="";
		System.out.println( );
		for(int i = 0;i<str.length;i++)
		{
			for(int j=0;j<str[0].length;j++)
			{
				s=s+str[i][j];
			}
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}
}
public class MethodsParameter {

	public static void main(String[] args) {
		byte b[] = {6,3,6,1,8,7};
		short s[] =  {1,2,3,4,5,6};
		int i[] = {7,5,6,3,4,3,2,1};
		char ch[] = {'a','j','i','t','h'};
		String st[] = {"EEE","AI","CS"};
		int x[][] = {{6,8,7},{8,5,4},{3,2,1}};
		int y[][] = {{10,20,30},{40,50,60},{70,80,90}};
		String str[][] ={{"apple","grapes","cherry"},{"cat","mat","tom"},{"xyz","yxz","zxy"}};
		assignments o1 = new assignments();

		o1.bytearray(b);
		o1.shortarray(s);
		o1.intarray(i);
		o1.chararray(ch);
		o1.stringarray(st);
		o1.onedarraysum(i);
		o1.charvowel(ch);
		o1.int2darray(x);
		o1.int2dsumarray(y);
		o1.subtract(x, y);
		o1.squarearray(i);
		o1.concatstring(str);

	}

}




