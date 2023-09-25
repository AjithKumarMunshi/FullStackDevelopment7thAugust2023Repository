package com.gentech.noargsconstructor;


class Fruit
{
	String FruitName;
	String taste;
	String FruitColor;
	int NoOfyearstoGrow;
	Fruit()
	{
		FruitName="Apple";
		taste="sweet";
		FruitColor="Red";
		NoOfyearstoGrow=2;
		System.out.println("FruitName:"+ FruitName);
		System.out.println("taste:"+taste);
		System.out.println("FruitColor:"+FruitColor);
		System.out.println("No of Years to Grow:"+NoOfyearstoGrow);	
		System.out.println("-----------------------");
	}}
class Flower{
	String FlowerName;
	String FlowerColor;
	int Petals;
	String scientificName;
	Flower()
	{
		FlowerName="Rose";
		FlowerColor="Red";
		Petals=5;
		scientificName="Rosa";
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerColor:"+FlowerColor);
		System.out.println("Petals:"+Petals);
		System.out.println("scientificName:"+scientificName);
		System.out.println("-----------------------");

	}}

class Vegetable{
	String vegName;
	String scientificName;
	String Color;
	int NoOfyearstoGrow;
	Vegetable()
	{
		vegName="Carrot";
		scientificName="Daucus carota";
		Color="Orange";
		NoOfyearstoGrow=6;
		System.out.println("VegName:"+vegName);
		System.out.println("scientificName:"+scientificName);
		System.out.println("Color:"+Color);
		System.out.println("NoOfyearstoGrow:"+NoOfyearstoGrow);

	
	}}

public class FruitsFlowerVegetablesNoArgs {

	public static void main(String[] args) {
		

		Fruit fru=new Fruit();
		
		Flower flo=new Flower();
		
	
		Vegetable veg=new Vegetable();
		
	}

}















