package com.gentech.constructoroverloading;

class product
{
	product(String productName,int productid)

	{
		System.out.println("product Name:"+productName);

		System.out.println("Product ID:"+productid);
		System.out.println("+++++++++++++++");
	}
	product( int productcost,String productlocation)
	{
		System.out.println("Product Cost:"+productcost);
		System.out.println("Product Location:"+productlocation);
	}
}


public class Products {

	public static void main(String[] args) {
		product hi=new product("Laptop",777);

		product bye=new product(450000,"bangalore");

	}

}
