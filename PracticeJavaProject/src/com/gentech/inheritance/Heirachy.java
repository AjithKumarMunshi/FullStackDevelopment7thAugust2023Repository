package com.gentech.inheritance;

class Heirachy1
{
	
	 void EvenOrOdd(int number) 
    {
        if (number%2==0) 
        {
            System.out.println("even no:"+number);
        } else {
            System.out.println("odd no:"+number);
        }
    }
}
class Heirachy2 extends Heirachy1
{
	void GreaterOrLesser(int a, int b) 
	{
        if (a>b) 
        {
            System.out.println(a + " is greater than " + b);
        } else if (a<b) 
        {
            System.out.println(a + " is lesser than " + b);
        } else 
        {
            System.out.println(a + " is equal to " + b);
        }
    }
}


class Heirachy3 extends Heirachy2
{
	void division(int x,int y)
	{
		System.out.println("division result:"+(x/y));
	}
}

public class Heirachy {
	public static void main(String[] args) {
		Heirachy2 o=new Heirachy2();
		o.EvenOrOdd(9);
		o.GreaterOrLesser(100,45);
		
		System.out.println("------------------------");
		
		Heirachy3 o2=new Heirachy3();
		o2.division(25,5);
		o2.GreaterOrLesser(3,13);
		
	}

}



	
