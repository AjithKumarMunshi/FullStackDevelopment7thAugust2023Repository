package com.gentech.twoDimensionalArray;
/*  three two one 
    black green red 
    ravi kumar ajith 
 */
public class Ass1 {

	public static void main(String[] args) {
		String str[][]= {{"ajith","kumar","ravi"},{"red","green","black"},{"one","two","three"}};
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length-1;j>=0;j--)
			{
			   System.out.print(str[i][j]+" ");	
			}
			System.out.println();
		}

	}

	}




