package com.gentech.inheritance;
class Hybrid1
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

class  Hybrid2 extends  Hybrid1
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

class  Hybrid3 extends  Hybrid2
{
	void cubes(int x, int y,int z)  
	{
        int cube = 0;
        for (int i=x;i>=y;i--) 
        {
        	cube=cube+(i*i*i);
        }
        System.out.println(+cube);
    }
}

class  Hybrid4 extends  Hybrid1
{
	void modulus(int x,int y)
	{
		System.out.println("modulus result:"+(x%y));
	}
}


public class Hybrid {

	public static void main(String[] args) {
	
		 Hybrid3 o=new  Hybrid3();
		o.EvenOrOdd(100);
		o. cubes(4,4,4);
		o.GreaterOrLesser(100,10);
		
		System.out.println("----------------");
	    Hybrid4 o2=new  Hybrid4();
		 o2.modulus(10,3);
		 
	}

}



