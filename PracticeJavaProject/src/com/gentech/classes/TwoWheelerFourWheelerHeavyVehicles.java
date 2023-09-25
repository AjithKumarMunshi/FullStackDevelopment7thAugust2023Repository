package com.gentech.classes;


class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	String mileage;
	float price;
	int bikeNo;
}
class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	String mileage;
	float price;
	int carNo;
}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	String mileage;
	float price;
	int vehNo;
}
public class TwoWheelerFourWheelerHeavyVehicles {

	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		two.bikeName="Royal Enflied";
		two.bikeModel="Huter 350";
		two.bikeColor="Black";
		two.mileage="30kmpl";
		two.price=145000;
		two.bikeNo=9999;
		System.out.println("BikeName:"+two.bikeName);
		System.out.println("BikeModel:"+two.bikeModel);
		System.out.println("BikeColor:"+two.bikeColor);
		System.out.println("Mileage:"+two.mileage);
		System.out.println("BikeNo:"+two.bikeNo);
		System.out.println("--------------------------");

		FourWheeler four=new FourWheeler();
		four.carName="BMW";
		four.carModel="BMW X1";
		four.carColor="White";
		four.mileage="20kmpl";
		four.price=4700000;
		four.carNo=8000;
		System.out.println("CarName:"+four.carName);
		System.out.println("CarModel:"+four.carModel);
		System.out.println("CarColor:"+four.carColor);
		System.out.println("Mileage:"+four.mileage);
		System.out.println("CarNo:"+four.carNo);
		System.out.println("--------------------------");

		HeavyWheeler heavy=new HeavyWheeler();
		heavy.vehName=" Truck";
		heavy.brandName="Eicher";
		heavy.loadCapacity="44Tones";
		heavy.mileage="4kmpl";
		heavy.price=700000;
		heavy.vehNo=8055;
		System.out.println("VehName:"+heavy.vehName);
		System.out.println("BrandName:"+heavy.brandName);
		System.out.println("LoadCapacity:"+heavy.loadCapacity);
		System.out.println("Mileage:"+heavy.mileage);
		System.out.println("Price:"+heavy.price);
		System.out.println("VehNo:"+heavy.vehNo);

	}

}












