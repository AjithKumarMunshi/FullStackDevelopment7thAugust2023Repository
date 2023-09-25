package com.gentech.inheritance;
class multiple
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

class multiple1 extends multiple
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

class multiple2 extends multiple1 
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

public class MultipleInheritance {
    public static void main(String[] args) {
    	multiple2 o = new multiple2();
        o.cubes(2,2,2); 
        o.cubes(1, 51,1);  
        o.cubes(4, 4,4);    
    }
}




