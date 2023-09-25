package com.gentech.forloops;

public class CubeForLoop {

	public static void main(String[] args) {
		int cube=0;
		for(int i=1;i<=10;i++)
		{
			cube=cube+(i*i*i);
		}
		System.out.println(cube);
	}
}
