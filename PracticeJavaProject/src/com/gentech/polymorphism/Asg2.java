package com.gentech.polymorphism;

abstract class Area
{
	abstract void area();
}

class Triangle extends  Area
{
	void area()
	{
		int b=5;
		int h=8;
		int res = (h*b/2);
		System.out.println(" Area of Triangle : "+res);
	}
}

class cube extends  Area
{
	void area()
	{
		int a  = 5;
		double res =6*a*a ;
		System.out.println(" Area of Cube : "+res);
	}
}
class parallelogram extends  Area
{
	void area()
	{
		int base = 5;
		int height = 3;
		double res = base*height;
		System.out.println(" Area of parallelogram  : "+res);
	}
}


public class Asg2 {

	public static void main(String[] args) 
	{
		Area area = null;

		Triangle T = new Triangle();
		cube c = new cube();
		parallelogram para = new 	parallelogram();

		area = T;
		area.area();

		area=c;
		area.area();

		area=para;
		area.area();
	}

}


