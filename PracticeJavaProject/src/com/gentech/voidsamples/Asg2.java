package com.gentech.voidsamples;

class assignmentdemo {
	void vowel(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It is Vowel");
		} else {
			System.out.println("It is not a vowel");
		}
	}

	void reverse(int a[][]) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[0].length - 1; j >= 0; j--) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	void onearray(int x[]) {
		int a[] = new int[x.length];
		int c = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			a[c] = x[i];
			c++;
		}
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
		}
	}


	void and(int x, int y)
	{
		if(x>y && y!=x)
		{
			System.out.print(x+" is greater");
		}
		else
		{
			System.out.println(y+" is greater");
		}
	}


	void or(char ch) {
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}


	void not(int x,int y) {
		if(x!=y && y!=x)
		{
			System.out.print(x+" is not equal");
		}
		else
		{
			System.out.println(y+" is equal ");
		}
	}

}

public class Asg2 {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 } };
		int x[] = { 6,5,4,3,2,1};
		assignmentdemo o1 = new assignmentdemo();
		o1.vowel('i');
		o1.reverse(a);
		o1.onearray(x);

		o1.and(22,15);
		o1.or('@');
		o1.not(15, 9);


	}
}


