package com.gentech.dowhile;

public class DisplayBy4DoWhile {

	public static void main(String[] args) {
		int i=100;
		do
		{
			if(i%4==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=200);

	}

}
