package com.gentech.encapsulation;
class maath1{
	static maath1 obj=null;
	private maath1()
	{
		//it is private constructor
	}
	void addition(int x,int y) {
		int res=x+y;
		System.out.println("addition :"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication: "+res);
	}
	public static maath1 getinstance() {
		if(obj==null)
		{
			obj=new maath1();
		}return obj;
	}
}
public class Maths1 {

	public static void main(String[] args) {
		maath1 o = maath1.getinstance();
		o.addition(10, 5);
		o.multiplication(3, 6);

		maath1 o1 = maath1.getinstance();
		o1.addition(7, 5);
		o1.multiplication(9, 6);

		maath1 o2 = maath1.getinstance();
		o2.addition(2, 5);
		o2.multiplication(3, 2);

		if(o==o1 && o1==o2)
		{
			System.out.println("singleton");
		}
		else
		{
			System.out.println("not singleton");
		}
	}
}	








