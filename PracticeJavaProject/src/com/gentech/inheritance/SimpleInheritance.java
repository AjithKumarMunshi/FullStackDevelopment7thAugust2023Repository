package com.gentech.inheritance;

class heritance1 
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

class heritance2 extends heritance1
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
public class SimpleInheritance {

    public static void main(String[] args) {
        heritance2 o = new heritance2();
        o.EvenOrOdd(100);
        o.GreaterOrLesser(25,45);
       
    }
}






