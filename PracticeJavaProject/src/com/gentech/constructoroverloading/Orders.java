package com.gentech.constructoroverloading;

class order
{
	order(String orderName,int orderid)

	{
		System.out.println("Order Name:"+orderName);

		System.out.println("Order id:"+orderid);
		System.out.println("+++++++++++++++");
	}
	order( int orderprice,String orderpaymentmode)
	{
		System.out.println("Order price:"+orderprice);
		System.out.println("Order payment mode:"+orderpaymentmode);
	}
}

public class Orders {

	public static void main(String[] args) {

		order hh=new order("Briyani",859);

		order rh=new order(500,"cash");
	}

}
