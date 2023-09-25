package com.gentech.noargsconstructor;

class Desktop 
{
	String brand;
	String model;
	int ramSizeGB;
	String isSSDSupported;

	{
		brand="Dell";
		model="S320";
		ramSizeGB=128;
		isSSDSupported="yes";
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("++++++++++++++++++++++");
	}
}

class Laptop 
{
	String brand;
	String model;
	double screenSizeInches;
	int batteryCapacity;

	{
		brand="HP";
		model="S20";
		screenSizeInches=14.5;
		batteryCapacity=8000;
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("++++++++++++++++++++++");	
	
	}}

class Mobile
{
	String brand;
	String model;
	String operatingSystem;
	String isMobileDataEnabled;

	{
		brand="Realme";
		model="realme 10pro";
		operatingSystem="Android";
		isMobileDataEnabled="No";
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);

	}
}
      public class DesktopLaptopMobileNoArgs {

	public static void main(String[] args) {

		Desktop D=new Desktop();
		

		Laptop L=new Laptop();
		
		Mobile M=new Mobile();
	}

      }













   
