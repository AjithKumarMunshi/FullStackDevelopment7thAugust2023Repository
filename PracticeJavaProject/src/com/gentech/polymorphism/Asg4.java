package com.gentech.polymorphism;

abstract class Vehicle 
{
	abstract void speed();
}

class Car extends Vehicle
{
	void speed()
	{
		String vehicleType = "Car";
		int maxSpeed = 200;
		System.out.println(vehicleType + " speed: " + maxSpeed + " km/h");
		System.out.println();
	}
}

class Bicycle extends Vehicle 
{
	void speed() 
	{
		String vehicleType = "Bicycle";
		int maxSpeed = 30;
		System.out.println(vehicleType + " speed: " + maxSpeed + " km/h");
		System.out.println();
	}
}

class Boat extends Vehicle 
{
	void speed()
	{
		String vehicleType = "Boat";
		int maxSpeed = 60;
		System.out.println(vehicleType + " speed: " + maxSpeed + " knots");
		System.out.println();
	}
}

public class Asg4 {
	public static void main(String[] args) {
		Vehicle vehicle = null;

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		vehicle = car;
		vehicle.speed();

		vehicle = bicycle;
		vehicle.speed();

		vehicle = boat;
		vehicle.speed();
	}
}



