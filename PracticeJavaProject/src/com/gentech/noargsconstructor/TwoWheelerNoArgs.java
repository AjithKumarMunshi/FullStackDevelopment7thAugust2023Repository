package com.gentech.noargsconstructor;



class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	String mileage;
	float price;
	int bikeNo;
	{
		bikeName="Royal Enflied";
		bikeModel="Huter 350";
		bikeColor="Black";
		mileage="30kmpl";
		price=145000;
		bikeNo=9999;
		System.out.println("BikeName:"+bikeName);
		System.out.println("BikeModel:"+bikeModel);
		System.out.println("BikeColor:"+bikeColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("BikeNo:"+bikeNo);
		System.out.println("--------------------------");	
	}}

class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	String mileage;
	float price;
	int carNo;
	{
		carName="BMW";
		carModel="BMW X1";
		carColor="White";
		mileage="20kmpl";
		price=4700000;
		carNo=8000;
		System.out.println("CarName:"+carName);
		System.out.println("CarModel:"+carModel);
		System.out.println("CarColor:"+carColor);
		System.out.println("Mileage:"+mileage);
		System.out.println("CarNo:"+carNo);
		System.out.println("--------------------------");
	
	}}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	String mileage;
	float price;
	int vehNo;
	{
		vehName=" Truck";
		brandName="Eicher";
		loadCapacity="44Tones";
		mileage="4kmpl";
		price=700000;
		vehNo=8055;
		System.out.println("VehName:"+vehName);
		System.out.println("BrandName:"+brandName);
		System.out.println("LoadCapacity:"+loadCapacity);
		System.out.println("Mileage:"+mileage);
		System.out.println("Price:"+price);
		System.out.println("VehNo:"+vehNo);
	
	}}

public class TwoWheelerNoArgs {

	public static void main(String[] args) {

		TwoWheeler two=new TwoWheeler();
		
		FourWheeler four=new FourWheeler();
		
		HeavyWheeler heavy=new HeavyWheeler();
		

	}}



