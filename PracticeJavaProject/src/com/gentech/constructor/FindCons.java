package com.gentech.constructor;

class sort
{
	sort(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				int temp=0;
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			System.out.println(x[i]);
		}
	}
}
public class FindCons {

	public static void main(String[] args) {
		int a[]= {1,8,9,6};
		sort obj=new sort(a);
		System.out.println("------");
		int b[]= {11,2,5,7};
		sort obj2=new sort(b);

	}

}