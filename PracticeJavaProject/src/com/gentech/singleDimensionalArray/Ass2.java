package com.gentech.singleDimensionalArray;

public class Ass2 {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%6==0)
			{	
				count=count+1;
			}
		}
		System.out.println("the number of count "+count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j<=200;j++)
		{

			if(j%6==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length/2;z<x.length;z++)

		{
			System.out.println("the second half order is  "+x[z]);
		}
	}



}

